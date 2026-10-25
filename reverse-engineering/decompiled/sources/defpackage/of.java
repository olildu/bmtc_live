package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailScreenKt;
import app.chalo.ncmc.ui.cardtransactiondetail.CardTransactionDetailViewState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class of implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18592a;
    public final /* synthetic */ CardTransactionDetailViewState b;
    public final /* synthetic */ int c;

    public /* synthetic */ of(CardTransactionDetailViewState cardTransactionDetailViewState, int i, int i2) {
        this.f18592a = i2;
        this.b = cardTransactionDetailViewState;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f18592a;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                CardTransactionDetailScreenKt.b(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            case 1:
                CardTransactionDetailScreenKt.a(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
            default:
                CardTransactionDetailScreenKt.e(this.b, composer, RecomposeScopeImplKt.updateChangedFlags(this.c | 1));
                break;
        }
        return Unit.f17538a;
    }
}
