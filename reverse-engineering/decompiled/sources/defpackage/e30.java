package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.dialogs.TncDialogKt;
import app.chalo.compose.components.plotline.PlotlineComposeWidgetKt;
import app.chalo.instantticket.ui.faredetails.compose.FareDetailsMainScreenKt;
import app.chalo.livetracking.universalsearch.ui.compose.NoResultFoundComposableKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15513a;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ e30(int i, String str, Modifier modifier, int i2) {
        this.f15513a = 4;
        this.d = i;
        this.c = str;
        this.b = modifier;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f15513a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                FareDetailsMainScreenKt.g(this.d, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c);
                break;
            case 1:
                NoResultFoundComposableKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e, composer, this.b, this.c);
                break;
            case 2:
                PlotlineComposeWidgetKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e, composer, this.b, this.c);
                break;
            case 3:
                PlotlineComposeWidgetKt.a(RecomposeScopeImplKt.updateChangedFlags(this.d | 1), this.e, composer, this.b, this.c);
                break;
            default:
                TncDialogKt.b(this.d, RecomposeScopeImplKt.updateChangedFlags(this.e | 1), composer, this.b, this.c);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ e30(Modifier modifier, int i, String str, int i2) {
        this.f15513a = 0;
        this.b = modifier;
        this.d = i;
        this.c = str;
        this.e = i2;
    }

    public /* synthetic */ e30(Modifier modifier, String str, int i, int i2) {
        this.f15513a = 1;
        this.b = modifier;
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ e30(String str, Modifier modifier, int i, int i2, int i3) {
        this.f15513a = i3;
        this.c = str;
        this.b = modifier;
        this.d = i;
        this.e = i2;
    }
}
