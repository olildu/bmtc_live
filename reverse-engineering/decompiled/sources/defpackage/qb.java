package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.validationsdk.blevalidation.ui.BleValidationScreen_androidKt;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayPassengerFieldData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qb implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19104a;
    public final /* synthetic */ ProductDetailsDisplayPassengerFieldData b;
    public final /* synthetic */ int c;

    public /* synthetic */ qb(ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData, int i, int i2) {
        this.f19104a = i2;
        this.b = productDetailsDisplayPassengerFieldData;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f19104a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                BleValidationScreen_androidKt.w(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                BleValidationScreen_androidKt.x(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }
}
