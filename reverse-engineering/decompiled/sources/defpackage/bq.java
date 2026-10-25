package defpackage;

import android.view.ContentInfo;
import android.view.ScrollCaptureSession;
import android.view.SurfaceView;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.FlagSet;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.android.datatransport.Transformer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import java.lang.reflect.Constructor;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bq implements DoubleFunction, ComponentRegistrarProcessor, Transformer, DebugViewProvider, ListenerSet.IterationFinishedEvent, Consumer, DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11222a;

    public /* synthetic */ bq(int i) {
        this.f11222a = i;
    }

    public static /* bridge */ /* synthetic */ ContentInfo d(Object obj) {
        return (ContentInfo) obj;
    }

    public static /* bridge */ /* synthetic */ ScrollCaptureSession e(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession f(Object obj) {
        return (ContentCaptureSession) obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj) {
        DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) obj;
        switch (this.f11222a) {
            case 24:
                eventDispatcher.drmKeysRemoved();
                break;
            case 25:
                eventDispatcher.drmKeysLoaded();
                break;
            default:
                eventDispatcher.drmKeysRestored();
                break;
        }
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.lambda$static$0((CrashlyticsReport) obj);
    }

    @Override // androidx.media3.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier
    public Constructor getConstructor() {
        switch (this.f11222a) {
            case 27:
                return DefaultExtractorsFactory.getFlacExtractorConstructor();
            default:
                return DefaultExtractorsFactory.getMidiExtractorConstructor();
        }
    }

    @Override // androidx.media3.common.DebugViewProvider
    public SurfaceView getDebugPreviewSurfaceView(int i, int i2) {
        return ow.a(i, i2);
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public double invoke(double d) {
        switch (this.f11222a) {
            case 2:
                return ColorSpaces.ExtendedSrgb$lambda$0(d);
            case 3:
                return ColorSpaces.ExtendedSrgb$lambda$1(d);
            case 4:
                return ColorSpaces.Bt2020Hlg$lambda$0(d);
            case 5:
                return ColorSpaces.Bt2020Hlg$lambda$1(d);
            case 6:
                return ColorSpaces.Bt2020Pq$lambda$0(d);
            default:
                return ColorSpaces.Bt2020Pq$lambda$1(d);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void invoke(Object obj, FlagSet flagSet) {
        DefaultAnalyticsCollector.lambda$new$0((AnalyticsListener) obj, flagSet);
    }
}
