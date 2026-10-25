package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.amazon.aps.ads.Aps;
import com.amazon.aps.ads.listeners.ApsInitializationListener;
import com.amazon.aps.ads.model.ApsInitConfig;
import com.amazon.aps.ads.model.ApsInitializationStatus;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import in.juspay.airborne.services.RemoteAssetService;
import in.juspay.hypersdk.core.DuiInterface;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.function.IOFunction;
import org.apache.commons.io.function.IOSupplier;
import so.plotline.insights.FlowViews.PlotlineScreenshotPositionsCompleteListener;
import so.plotline.insights.FlowViews.WidgetReloadCallback;
import so.plotline.insights.Listeners.PlotlineWidgetChangeListener;
import so.plotline.insights.PlotlineWidget;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a7 implements ApsAsyncUtil.ApsReturnRunnable, ApsInitializationListener, Continuation, CallbackToFutureAdapter.Resolver, ListenerSet.Event, ListenerSet.IterationFinishedEvent, ExtractorsFactory, DefaultTrackSelector.TrackInfo.Factory, RemoteAssetService.DownloadCallback, OnApplyWindowInsetsListener, OnCompleteListener, IOConsumer, IOSupplier, PlotlineScreenshotPositionsCompleteListener, PlotlineWidgetChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a7(int i, Object obj, Object obj2) {
        this.f168a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // so.plotline.insights.Listeners.PlotlineWidgetChangeListener
    public void a(boolean z) {
        PlotlineWidget plotlineWidget = (PlotlineWidget) this.b;
        PlotlineWidget plotlineWidget2 = (PlotlineWidget) this.c;
        if (!z) {
            HashSet hashSet = PlotlineWidget.p;
            return;
        }
        plotlineWidget.h = 0.0d;
        WidgetReloadCallback widgetReloadCallback = plotlineWidget2.g;
        if (widgetReloadCallback != null) {
            widgetReloadCallback.a();
        } else {
            plotlineWidget2.i(Boolean.FALSE);
        }
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public void accept(Object obj) throws IOException {
        switch (this.f168a) {
            case 23:
                o90.b((IOConsumer) this.b, (IOConsumer) this.c, obj);
                break;
            case 24:
                ((IOConsumer) this.c).accept(((IOFunction) this.b).apply(obj));
                break;
            default:
                ((Consumer) this.c).n(((IOFunction) this.b).apply(obj));
                break;
        }
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        int i = this.f168a;
        return o90.a(this, iOConsumer);
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return CoroutineAdapterKt.asListenableFuture$lambda$0((Deferred) this.b, this.c, completer);
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        switch (this.f168a) {
            case 18:
                return DefaultTrackSelector.lambda$selectVideoTrack$1((DefaultTrackSelector.Parameters) this.b, (int[]) this.c, i, trackGroup, iArr);
            default:
                return DefaultTrackSelector.lambda$selectTextTrack$3((DefaultTrackSelector.Parameters) this.c, (String) this.b, i, trackGroup, iArr);
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return ((DefaultMediaSourceFactory) this.b).lambda$createMediaSource$0((Format) this.c);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return q20.b(this, z);
    }

    @Override // org.apache.commons.io.function.IOSupplier
    public Object get() {
        switch (this.f168a) {
            case 26:
                return ((IOFunction) this.b).apply(((IOSupplier) this.c).get());
            default:
                return ((IOFunction) this.b).apply(((Supplier) this.c).get());
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f168a) {
            case 6:
                ((AnalyticsListener) obj).onPlaybackParametersChanged((AnalyticsListener.EventTime) this.b, (PlaybackParameters) this.c);
                break;
            case 7:
                ((AnalyticsListener) obj).onAvailableCommandsChanged((AnalyticsListener.EventTime) this.b, (Player.Commands) this.c);
                break;
            case 8:
            default:
                ((AnalyticsListener) obj).onTrackSelectionParametersChanged((AnalyticsListener.EventTime) this.b, (TrackSelectionParameters) this.c);
                break;
            case 9:
                ((AnalyticsListener) obj).onAudioAttributesChanged((AnalyticsListener.EventTime) this.b, (AudioAttributes) this.c);
                break;
            case 10:
                ((AnalyticsListener) obj).onMetadata((AnalyticsListener.EventTime) this.b, (Metadata) this.c);
                break;
            case 11:
                ((AnalyticsListener) obj).onTracksChanged((AnalyticsListener.EventTime) this.b, (Tracks) this.c);
                break;
            case 12:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.b, (List<Cue>) this.c);
                break;
            case 13:
                ((AnalyticsListener) obj).onDeviceInfoChanged((AnalyticsListener.EventTime) this.b, (DeviceInfo) this.c);
                break;
            case 14:
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$58((AnalyticsListener.EventTime) this.b, (VideoSize) this.c, (AnalyticsListener) obj);
                break;
            case 15:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.b, (CueGroup) this.c);
                break;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        View view2 = (View) this.b;
        View view3 = (View) this.c;
        Intrinsics.i(view, "<unused var>");
        Intrinsics.i(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.statusBars());
        Intrinsics.h(insets2, "getInsets(...)");
        Insets insets3 = insets.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.h(insets3, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = insets2.top;
        view2.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
        Intrinsics.g(layoutParams3, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
        layoutParams4.height = insets3.bottom;
        view3.setLayoutParams(layoutParams4);
        return insets;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((EnhancedIntentService) this.b).lambda$onStartCommand$1((Intent) this.c, task);
    }

    @Override // in.juspay.airborne.services.RemoteAssetService.DownloadCallback
    public void onDownload(boolean z, String str, String str2) {
        ((DuiInterface) this.c).lambda$fileDownloadCallback$10((String) this.b, z, str, str2);
    }

    @Override // com.amazon.aps.ads.listeners.ApsInitializationListener
    public void onInitializationCompleted(ApsInitializationStatus apsInitializationStatus) {
        Aps.lambda$initialize$2((ApsInitConfig) this.b, (ApsInitializationListener) this.c, apsInitializationStatus);
    }

    @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsReturnRunnable
    public Object run() {
        return Aps.lambda$initialize$0((String) this.b, (Context) this.c);
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public /* synthetic */ ExtractorsFactory mo7941setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return q20.c(this, factory);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f168a) {
            case 2:
                return ((ConfigFetchHandler) this.b).lambda$fetchIfCacheExpiredAndNotThrottled$3((Date) this.c, task);
            case 3:
                return ((ConfigFetchHandler) this.b).lambda$fetchNowWithTypeAndAttemptNumber$1((HashMap) this.c, task);
            default:
                return ((ConfigRealtimeHttpClient) this.b).lambda$beginRealtimeHttpStream$1((Task) this.c, task);
        }
    }

    public /* synthetic */ a7(Object obj, String str, int i) {
        this.f168a = i;
        this.c = obj;
        this.b = str;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return q20.a(this, uri, map);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((DefaultAnalyticsCollector) this.b).lambda$setPlayer$1((Player) this.c, (AnalyticsListener) obj, flagSet);
    }
}
