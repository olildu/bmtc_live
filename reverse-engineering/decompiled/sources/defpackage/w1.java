package defpackage;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import app.chalo.ncmc.domain.CardTransactionPagingSource;
import app.chalo.ncmc.domain.FetchChaloCardTransactionsUseCase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19883a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f19883a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19883a) {
            case 0:
                Function1 function1 = (Function1) this.b;
                Function0 function0 = (Function0) this.c;
                MutableState mutableState = (MutableState) this.d;
                MutableState mutableState2 = (MutableState) this.e;
                MutableState mutableState3 = (MutableState) this.f;
                if (((TextFieldValue) mutableState.getValue()).getText().length() == 0) {
                    mutableState2.setValue(Boolean.TRUE);
                } else {
                    function1.invoke(((TextFieldValue) mutableState.getValue()).getText());
                    mutableState3.setValue(Boolean.valueOf(!((Boolean) mutableState3.getValue()).booleanValue()));
                    function0.invoke();
                }
                return Unit.f17538a;
            case 1:
                return new CardTransactionPagingSource(((FetchChaloCardTransactionsUseCase) this.b).f6230a, (String) this.c, (String) this.d, (String) this.e, (String) this.f);
            default:
                return NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$11$lambda$10((DrawerState) this.b, (Density) this.c, (FiniteAnimationSpec) this.d, (FiniteAnimationSpec) this.e, (FiniteAnimationSpec) this.f);
        }
    }
}
