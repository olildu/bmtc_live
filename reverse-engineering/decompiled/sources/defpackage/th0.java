package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.Person;
import android.media.MediaCodecInfo;
import android.media.MediaParser;
import android.media.metrics.MediaMetricsManager;
import android.net.Uri;
import androidx.media3.common.Format;
import androidx.media3.common.util.TimestampAdjuster;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.hls.HlsExtractorFactory;
import androidx.media3.exoplayer.hls.HlsMediaChunkExtractor;
import androidx.media3.exoplayer.hls.MediaParserHlsMediaChunkExtractor;
import androidx.media3.exoplayer.source.MediaParserExtractorAdapter;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.exoplayer.source.chunk.MediaParserChunkExtractor;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.android.datatransport.Transformer;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.security.cert.Extension;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class th0 implements ChunkExtractor.Factory, ProgressiveMediaExtractor.Factory, HlsExtractorFactory, Transformer, ExtractorsFactory, Id3Decoder.FramePredicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19658a;

    public /* synthetic */ th0(int i) {
        this.f19658a = i;
    }

    public static /* bridge */ /* synthetic */ NotificationChannel b(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup c(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* bridge */ /* synthetic */ Person d(Object obj) {
        return (Person) obj;
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint e(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint g(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager h(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Extension k(Object obj) {
        return (Extension) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return Notification.DecoratedCustomViewStyle.class;
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return ((MessagingClientEventExtension) obj).toByteArray();
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public HlsMediaChunkExtractor createExtractor(Uri uri, Format format, List list, TimestampAdjuster timestampAdjuster, Map map, ExtractorInput extractorInput, PlayerId playerId) {
        return MediaParserHlsMediaChunkExtractor.lambda$static$0(uri, format, list, timestampAdjuster, map, extractorInput, playerId);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        switch (this.f19658a) {
            case 14:
                return Mp3Extractor.lambda$static$0();
            default:
                return Mp4Extractor.lambda$static$1();
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return MediaParserExtractorAdapter.lambda$static$0(playerId);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Decoder.FramePredicate
    public boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        return Mp3Extractor.lambda$static$1(i, i2, i3, i4, i5);
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public /* synthetic */ HlsExtractorFactory experimentalParseSubtitlesDuringExtraction(boolean z) {
        return t70.a(this, z);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        int i = this.f19658a;
        return q20.b(this, z);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
    public /* synthetic */ Format getOutputTextFormat(Format format) {
        switch (this.f19658a) {
            case 7:
                return xo.b(this, format);
            default:
                return t70.b(this, format);
        }
    }

    @Override // androidx.media3.exoplayer.hls.HlsExtractorFactory
    public /* synthetic */ HlsExtractorFactory setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return t70.c(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        int i = this.f19658a;
        return q20.a(this, uri, map);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
    public ChunkExtractor createProgressiveMediaExtractor(int i, Format format, boolean z, List list, TrackOutput trackOutput, PlayerId playerId) {
        return MediaParserChunkExtractor.lambda$static$0(i, format, z, list, trackOutput, playerId);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
    /* JADX INFO: renamed from: experimentalParseSubtitlesDuringExtraction, reason: collision with other method in class */
    public /* synthetic */ ChunkExtractor.Factory mo7939experimentalParseSubtitlesDuringExtraction(boolean z) {
        return xo.a(this, z);
    }

    @Override // androidx.media3.exoplayer.source.chunk.ChunkExtractor.Factory
    /* JADX INFO: renamed from: setSubtitleParserFactory, reason: collision with other method in class */
    public /* synthetic */ ChunkExtractor.Factory mo7940setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return xo.c(this, factory);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory, reason: collision with other method in class */
    public /* synthetic */ ExtractorsFactory mo7941setSubtitleParserFactory(SubtitleParser.Factory factory) {
        int i = this.f19658a;
        return q20.c(this, factory);
    }
}
