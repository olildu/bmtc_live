package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.home.ui.compose.ChaloTutorialBottomSheetKt;
import app.chalo.instantticket.ui.faredetails.compose.FareBreakupSectionKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19018a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ pb(int i, int i2, String str, String str2, String str3) {
        this.f19018a = i2;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19018a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                BleValidationScreen_androidKt.N(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            case 1:
                BleValidationScreen_androidKt.M(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            case 2:
                ChaloTutorialBottomSheetKt.b(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                FareBreakupSectionKt.e(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }
}
