package main.java.com.synisys.iterator.api;

import main.java.com.synisys.iterator.helper.TVChannelCategory;
import main.java.com.synisys.iterator.model.Channel;

public interface ChannelCollection {

    public void addChannel(Channel channel);
    public void removeChannel(Channel channel);
    public ChannelIterator iterator(TVChannelCategory category);

}
