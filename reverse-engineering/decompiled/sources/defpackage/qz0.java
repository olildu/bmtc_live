package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenKt;
import app.chalo.validationsdk.blevalidation.ui.qrvalidation.QRValidationScreenUIState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qz0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19165a;
    public final /* synthetic */ QRValidationScreenUIState.QRWithProductAndUserDetails b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ qz0(QRValidationScreenUIState.QRWithProductAndUserDetails qRWithProductAndUserDetails, Modifier modifier, int i, Function1 function1, int i2, int i3) {
        this.f19165a = i3;
        this.b = qRWithProductAndUserDetails;
        this.c = modifier;
        this.d = i;
        this.e = function1;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19165a) {
            case 0:
                ((Integer) obj2).getClass();
                QRValidationScreenKt.e(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                QRValidationScreenKt.a(this.b, this.c, this.d, this.e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f | 1));
                break;
        }
        return Unit.f17538a;
    }
}
