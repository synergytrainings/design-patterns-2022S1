package main.java.com.synisys.iterator;

import main.java.com.synisys.iterator.api.ChannelCollection;
import main.java.com.synisys.iterator.api.ChannelIterator;
import main.java.com.synisys.iterator.helper.TVChannelCategory;
import main.java.com.synisys.iterator.impl.ChannelCollectionImpl;
import main.java.com.synisys.iterator.model.Channel;

public class Main {
    public static void main(String[] args) {
        ChannelCollection channels = populateChannels();
        ChannelIterator baseIterator = channels.iterator(TVChannelCategory.ALL);
        while (baseIterator.hasNext()) {
            Channel channel = baseIterator.next();
            System.out.println(channel.getName());
        }
        System.out.println("All channels in Movies category");
        ChannelIterator moviesIterator = channels.iterator(TVChannelCategory.MOVIES);
        while (moviesIterator.hasNext()) {
            Channel channel = moviesIterator.next();
            System.out.println(channel.getName());
        }
    }

    private static ChannelCollection populateChannels() {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.addChannel(new Channel("HFilm", TVChannelCategory.MOVIES));
        channels.addChannel(new Channel("MTV", TVChannelCategory.MUSIC));
        channels.addChannel(new Channel("Discovery Science", TVChannelCategory.EDUCATIONAL));
        channels.addChannel(new Channel("Comedy Int", TVChannelCategory.MOVIES));
        channels.addChannel(new Channel("FOX", TVChannelCategory.KIDS));
        channels.addChannel(new Channel("Hits Int", TVChannelCategory.MOVIES));
        channels.addChannel(new Channel("France Canale+", TVChannelCategory.MOVIES));
        channels.addChannel(new Channel("BBC", TVChannelCategory.NEWS));
        channels.addChannel(new Channel("Rally Plus", TVChannelCategory.SPORT));
        return channels;
    }
}
