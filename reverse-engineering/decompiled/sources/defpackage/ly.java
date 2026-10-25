package defpackage;

import android.net.Uri;
import android.view.WindowMetrics;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.drm.DrmSessionManager;
import androidx.media3.exoplayer.offline.DownloadHelper;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.text.SubtitleParser;
import coil3.EventListener;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import java.nio.file.Path;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ly implements TrackSelector.InvalidationListener, DrmSessionManager.DrmSessionReference, EventListener.Factory, ExtractorsFactory, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18355a;

    public /* synthetic */ ly(int i) {
        this.f18355a = i;
    }

    public static /* bridge */ /* synthetic */ Class d() {
        return SelectGesture.class;
    }

    public static /* bridge */ /* synthetic */ Path e(Object obj) {
        return (Path) obj;
    }

    public static /* bridge */ /* synthetic */ Class h() {
        return DeleteRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return DeleteGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return SelectRangeGesture.class;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return WindowMetrics.class;
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public Extractor[] createExtractors() {
        return q20.d();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ ExtractorsFactory experimentalSetTextTrackTranscodingEnabled(boolean z) {
        return q20.b(this, z);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public /* synthetic */ void onRendererCapabilitiesChanged(Renderer renderer) {
        pk1.a(this, renderer);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        DownloadHelper.lambda$new$2();
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionManager.DrmSessionReference
    public void release() {
        g00.a();
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    /* JADX INFO: renamed from: setSubtitleParserFactory */
    public /* synthetic */ ExtractorsFactory mo7941setSubtitleParserFactory(SubtitleParser.Factory factory) {
        return q20.c(this, factory);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f18355a) {
            case 28:
                return FcmBroadcastProcessor.lambda$startMessagingService$1(task);
            default:
                return FcmBroadcastProcessor.lambda$bindToMessagingService$3(task);
        }
    }

    @Override // androidx.media3.extractor.ExtractorsFactory
    public /* synthetic */ Extractor[] createExtractors(Uri uri, Map map) {
        return q20.a(this, uri, map);
    }
}
