package app.chalo.plotline;

import android.widget.FrameLayout;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.xm0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/plotline/PlotlineXmlWidgetView;", "Landroid/widget/FrameLayout;", "", "id", "", "setWidgetId", "(Ljava/lang/String;)V", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlotlineXmlWidgetView extends FrameLayout {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6844a;

    public final void setWidgetId(String id) {
        Intrinsics.i(id, "id");
        this.f6844a = id;
        if (id.length() <= 0) {
            return;
        }
        ComposableLambdaKt.composableLambdaInstance(-1394598334, true, new xm0(this, 3));
        throw null;
    }
}
