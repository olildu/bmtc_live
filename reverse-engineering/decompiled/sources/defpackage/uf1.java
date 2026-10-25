package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.compose.utils.SafeFocusRequester;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsScreenKt;
import app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uf1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19742a;
    public final /* synthetic */ SuperPassEnterUserDetailsUIState b;
    public final /* synthetic */ SafeFocusRequester c;
    public final /* synthetic */ int d;

    public /* synthetic */ uf1(SuperPassEnterUserDetailsUIState superPassEnterUserDetailsUIState, SafeFocusRequester safeFocusRequester, int i, int i2) {
        this.f19742a = i2;
        this.b = superPassEnterUserDetailsUIState;
        this.c = safeFocusRequester;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19742a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                SuperPassEnterUserDetailsScreenKt.c(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
            default:
                SuperPassEnterUserDetailsScreenKt.b(this.b, this.c, composer, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                break;
        }
        return Unit.f17538a;
    }
}
