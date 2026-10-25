package defpackage;

import androidx.media3.common.Timeline;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class if0 {
    public static long a(LoadControl loadControl) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    public static long b(LoadControl loadControl, PlayerId playerId) {
        return loadControl.getBackBufferDurationUs();
    }

    public static void c(LoadControl loadControl) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    public static void d(LoadControl loadControl, PlayerId playerId) {
        loadControl.onPrepared();
    }

    public static void e(LoadControl loadControl) {
        throw new IllegalStateException("onReleased not implemented");
    }

    public static void f(LoadControl loadControl, PlayerId playerId) {
        loadControl.onReleased();
    }

    public static void g(LoadControl loadControl) {
        throw new IllegalStateException("onStopped not implemented");
    }

    public static void h(LoadControl loadControl, PlayerId playerId) {
        loadControl.onStopped();
    }

    public static void i(LoadControl loadControl, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        loadControl.onTracksSelected(rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    public static void j(LoadControl loadControl, PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        loadControl.onTracksSelected(timeline, mediaPeriodId, rendererArr, trackGroupArray, exoTrackSelectionArr);
    }

    public static void k(LoadControl loadControl, Renderer[] rendererArr, TrackGroupArray trackGroupArray, ExoTrackSelection[] exoTrackSelectionArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    public static boolean l(LoadControl loadControl) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    public static boolean m(LoadControl loadControl, PlayerId playerId) {
        return loadControl.retainBackBufferFromKeyframe();
    }

    public static boolean n(LoadControl loadControl, long j, long j2, float f) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    public static boolean o(LoadControl loadControl, LoadControl.Parameters parameters) {
        return loadControl.shouldContinueLoading(parameters.playbackPositionUs, parameters.bufferedDurationUs, parameters.playbackSpeed);
    }

    public static boolean p(LoadControl loadControl, long j, float f, boolean z, long j2) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    public static boolean q(LoadControl loadControl, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, float f, boolean z, long j2) {
        return loadControl.shouldStartPlayback(j, f, z, j2);
    }

    public static boolean r(LoadControl loadControl, LoadControl.Parameters parameters) {
        return loadControl.shouldStartPlayback(parameters.timeline, parameters.mediaPeriodId, parameters.bufferedDurationUs, parameters.playbackSpeed, parameters.rebuffering, parameters.targetLiveOffsetUs);
    }
}
