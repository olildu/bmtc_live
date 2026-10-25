package defpackage;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.ads.NativeInlineAdTemplatesKt;
import app.chalo.busesaroundyou.BusesAroundYouScreenKt;
import app.chalo.compose.components.ChaloSectionHighlightKt;
import app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.LivePassengerIndicatorBottomSheetKt;
import app.chalo.uistate.snackbar.SnackbarUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19916a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wd(float f, Modifier modifier, int i) {
        this.f19916a = 3;
        this.b = f;
        this.d = modifier;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19916a) {
            case 0:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                BusesAroundYouScreenKt.a((SnackbarUIState) this.d, this.b, (Composer) obj, iUpdateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                ChaloSectionHighlightKt.a((BoxScope) this.d, this.b, (Composer) obj, iUpdateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                LivePassengerIndicatorBottomSheetKt.d((List) this.d, this.b, (Composer) obj, iUpdateChangedFlags3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.c | 1);
                NativeInlineAdTemplatesKt.e(this.b, (Modifier) this.d, (Composer) obj, iUpdateChangedFlags4);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ wd(Object obj, float f, int i, int i2) {
        this.f19916a = i2;
        this.d = obj;
        this.b = f;
        this.c = i;
    }
}
