package main.java.com.synisys.iterator.impl;

import main.java.com.synisys.iterator.api.ChannelCollection;
import main.java.com.synisys.iterator.api.ChannelIterator;
import main.java.com.synisys.iterator.helper.TVChannelCategory;
import main.java.com.synisys.iterator.model.Channel;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIterator iterator(TVChannelCategory category) {
        return new ChannelIteratorImpl(category, this.channelsList);
    }

}
