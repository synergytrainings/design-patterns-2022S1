package main.java.com.synisys.iterator.impl;

import main.java.com.synisys.iterator.api.ChannelIterator;
import main.java.com.synisys.iterator.helper.TVChannelCategory;
import main.java.com.synisys.iterator.model.Channel;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator {

    private TVChannelCategory category;
    private List<Channel> channels;
    private int index;

    public ChannelIteratorImpl(TVChannelCategory category,
                               List<Channel> channelsList) {
        this.category = category;
        this.channels = channelsList;
    }

    @Override
    public boolean hasNext() {
        while (index < channels.size()) {
            Channel c = channels.get(index);
            if (c.getCategory().equals(category) || category.equals(TVChannelCategory.ALL)) {
                return true;
            } else
                index++;
        }
        return false;
    }

    @Override
    public Channel next() {
        Channel c = channels.get(index);
        index++;
        return c;
    }

}
