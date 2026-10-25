package defpackage;

import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import androidx.media3.common.FlagSet;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.datasource.cache.CacheWriter;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.offline.ProgressiveDownloader;
import androidx.media3.exoplayer.source.ProgressiveMediaExtractor;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.RandomTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectionUtil;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleExtractor;
import app.chalo.contract.RemoteConfigFetcherContractAndroid;
import app.chalo.crashlytics.CrashlyticsLogger;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import in.juspay.hypersmshandler.SmsConsentHandler;
import in.juspay.hypersmshandler.SmsRetriever;
import in.juspay.hypersmshandler.Tracker;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.JobSupport;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal._UtilJvmKt;
import org.apache.commons.io.function.IOConsumer;
import org.apache.commons.io.input.ProxyInputStream;
import org.apache.commons.io.output.ProxyOutputStream;
import org.apache.commons.io.output.ProxyWriter;
import org.json.JSONObject;
import so.plotline.insights.Activities.PlotlineNotificationListener;
import so.plotline.insights.Listeners.PlotlineRedirectListener;
import so.plotline.insights.Models.d;
import so.plotline.insights.Tasks.j;
import so.plotline.insights.a;
import so.plotline.plotline_kmp.Plotline;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class os0 implements PlotlineRedirectListener, PlotlineNotificationListener, CacheWriter.ProgressListener, ProgressiveMediaExtractor.Factory, IOConsumer, TrackSelectionUtil.AdaptiveTrackSelectionFactory, Deferred.DeferredHandler, OnSuccessListener, OnFailureListener, Continuation, ListenerSet.Event, ListenerSet.IterationFinishedEvent, Consumer, OnCompleteListener, Interpolator, SynchronizationGuard.CriticalSection, EventListener.Factory, a.m, j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18975a;
    public final /* synthetic */ Object b;

    public /* synthetic */ os0(Object obj, int i) {
        this.f18975a = i;
        this.b = obj;
    }

    @Override // so.plotline.insights.a.m
    public void a(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5) {
        a.m mVar = ((so.plotline.insights.FlowViews.Overlay.a) this.b).d;
        if (mVar != null) {
            mVar.a(bool, bool2, str, str2, str3, str4, str5);
        }
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public void accept(Object obj) throws IOException {
        switch (this.f18975a) {
            case 4:
                ((ProxyInputStream) this.b).handleIOException((IOException) obj);
                break;
            case 5:
                ((ProxyOutputStream) this.b).handleIOException((IOException) obj);
                break;
            case 6:
                ((ProxyWriter) this.b).handleIOException((IOException) obj);
                break;
            case 18:
                ((SubtitleExtractor) this.b).lambda$parseAndWriteToOutput$0((CuesWithTiming) obj);
                break;
            default:
                ((ImmutableList.Builder) this.b).h((CuesWithTiming) obj);
                break;
        }
    }

    @Override // org.apache.commons.io.function.IOConsumer
    public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
        int i = this.f18975a;
        return o90.a(this, iOConsumer);
    }

    public void b(JSONObject jSONObject) {
        ym0 ym0Var = (ym0) this.b;
        try {
            Intrinsics.f(jSONObject);
            ym0Var.invoke(Plotline.a(jSONObject));
        } catch (Exception unused) {
            ym0Var.invoke(null);
        }
    }

    public void c(HashMap map) {
        ((app.chalo.plotline.a) this.b).invoke(map);
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return _UtilJvmKt.asFactory$lambda$9((EventListener) this.b, call);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition) {
        return ((RandomTrackSelection.Factory) this.b).lambda$createTrackSelections$0(definition);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor.Factory
    public ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId) {
        return ProgressiveMediaSource.Factory.lambda$new$0((ExtractorsFactory) this.b, playerId);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.f18975a) {
            case 22:
                ((Uploader) this.b).i.a();
                return null;
            case 23:
                return ((ClientHealthMetricsStore) this.b).b();
            case 24:
                return Integer.valueOf(((EventStore) this.b).k());
            default:
                WorkInitializer workInitializer = (WorkInitializer) this.b;
                Iterator it = workInitializer.b.p0().iterator();
                while (it.hasNext()) {
                    workInitializer.c.b((TransportContext) it.next(), 1);
                }
                return null;
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$0((String) this.b, f);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        RemoteConfigDeferredProxy.lambda$setupListener$0((CrashlyticsRemoteConfigListener) this.b, provider);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f18975a) {
            case 13:
                ((Player.Listener) obj).onTracksChanged((Tracks) this.b);
                break;
            default:
                ((Player.Listener) obj).onMediaMetadataChanged((MediaMetadata) this.b);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        CompletableDeferred completableDeferred = (CompletableDeferred) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            completableDeferred.c(exception);
        } else if (task.isCanceled()) {
            ((JobSupport) completableDeferred).cancel(null);
        } else {
            completableDeferred.complete(task.getResult());
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception) {
        switch (this.f18975a) {
            case 10:
                RemoteConfigFetcherContractAndroid remoteConfigFetcherContractAndroid = (RemoteConfigFetcherContractAndroid) this.b;
                Intrinsics.i(exception, "exception");
                CrashlyticsLogger crashlyticsLogger = remoteConfigFetcherContractAndroid.b;
                if (exception instanceof FirebaseRemoteConfigClientException) {
                    crashlyticsLogger.i(exception.getCause());
                } else if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
                    String message = exception.toString();
                    Intrinsics.i(message, "message");
                } else if (exception instanceof FirebaseRemoteConfigServerException) {
                    crashlyticsLogger.i(exception.getCause());
                }
                break;
            case 16:
                SmsConsentHandler.a((Tracker) this.b, exception);
                break;
            default:
                SmsRetriever.a((SmsRetriever) this.b, exception);
                break;
        }
    }

    @Override // androidx.media3.datasource.cache.CacheWriter.ProgressListener
    public void onProgress(long j, long j2, long j3) {
        ((ProgressiveDownloader) this.b).onProgress(j, j2, j3);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f18975a) {
            case 9:
                ((app.chalo.contract.a) this.b).invoke(obj);
                break;
            default:
                ((t01) this.b).invoke(obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f18975a) {
            case 12:
                return Boolean.valueOf(((SessionReportingCoordinator) this.b).onReportSendComplete(task));
            default:
                return Utils.lambda$awaitEvenIfOnMainThread$0((CountDownLatch) this.b, task);
        }
    }

    public /* synthetic */ os0(so.plotline.insights.FlowViews.Overlay.a aVar, d dVar, int i) {
        this.f18975a = 28;
        this.b = aVar;
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        ((SimpleBasePlayer) this.b).lambda$new$0((Player.Listener) obj, flagSet);
    }
}
