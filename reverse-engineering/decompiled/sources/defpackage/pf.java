package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailScreenKt;
import app.chalo.validationsdk.blevalidation.ui.common.JourneyDetailsBottomSheetKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19030a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ int e;

    public /* synthetic */ pf(String str, List list, Modifier modifier, int i, int i2) {
        this.f19030a = i2;
        this.b = str;
        this.c = list;
        this.d = modifier;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f19030a) {
            case 0:
                num.getClass();
                CardTransactionDetailScreenKt.c(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            case 1:
                num.getClass();
                CardTransactionDetailScreenKt.c(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
            default:
                num.intValue();
                JourneyDetailsBottomSheetKt.c(this.b, this.c, this.d, composer, RecomposeScopeImplKt.updateChangedFlags(this.e | 1));
                break;
        }
        return Unit.f17538a;
    }
}
