package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.material3.LabelKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import app.chalo.home.ui.home.HomeTabScaffoldKt;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaUiModel;
import app.chalo.ncmc.ui.pendingrecharge.compose.PendingRechargeScreenKt;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionScreenKt;
import app.chalo.premiumbus.ui.slotselection.PbSlotCardUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.productpurchase.passselection.ui.CategorySelectionTabUIState;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt;
import app.chalo.titoridedetail.ui.compose.TitoStopInfoWindowKt;
import app.chalo.wallet.ui.access.WalletAccessBaseScreenKt;
import app.chalo.wallet.ui.access.WalletAutoReclaimStatus;
import app.chalo.wallet.ui.mainbalance.compose.WalletBalanceComposableKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20073a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y4(CategorySelectionTabUIState categorySelectionTabUIState, boolean z, Modifier modifier, int i) {
        this.f20073a = 4;
        this.e = categorySelectionTabUIState;
        this.b = z;
        this.c = modifier;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20073a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AndroidSelectionHandles_androidKt.SelectionHandleIcon$lambda$0((Modifier) this.c, (Function0) this.e, this.b, this.d, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                CityLocationSelectionScreenKt.a(this.b, (Modifier) this.c, (Function1) this.e, (Composer) obj, iUpdateChangedFlags);
                return Unit.f17538a;
            case 2:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                HomeTabScaffoldKt.b(this.b, (Function1) this.c, (List) this.e, (Composer) obj, iUpdateChangedFlags2);
                return Unit.f17538a;
            case 3:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LabelKt.HandleInteractions$lambda$7(this.b, (TooltipState) this.c, (MutableInteractionSource) this.e, this.d, (Composer) obj, iIntValue2);
            case 4:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags3 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                PassSelectionScreenKt.b((CategorySelectionTabUIState) this.e, this.b, (Modifier) this.c, (Composer) obj, iUpdateChangedFlags3);
                return Unit.f17538a;
            case 5:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags4 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                PendingRechargeScreenKt.f((ArrayList) this.c, this.b, (Function0) this.e, (Composer) obj, iUpdateChangedFlags4);
                return Unit.f17538a;
            case 6:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags5 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                PremiumBusSlotSelectionUiStateKt.q((Modifier) this.c, (PbSlotCardUIState) this.e, this.b, (Composer) obj, iUpdateChangedFlags5);
                return Unit.f17538a;
            case 7:
                int iIntValue3 = ((Integer) obj2).intValue();
                return TextFieldSelectionManagerKt.TextFieldSelectionHandle$lambda$3(this.b, (ResolvedTextDirection) this.c, (TextFieldSelectionManager) this.e, this.d, (Composer) obj, iIntValue3);
            case 8:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags6 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                TitoStopInfoWindowKt.b((String) this.c, (StopLiveEtaUiModel) this.e, this.b, (Composer) obj, iUpdateChangedFlags6);
                return Unit.f17538a;
            case 9:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags7 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                WalletAccessBaseScreenKt.a(this.b, (WalletAutoReclaimStatus) this.c, (Function1) this.e, (Composer) obj, iUpdateChangedFlags7);
                return Unit.f17538a;
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags8 = RecomposeScopeImplKt.updateChangedFlags(this.d | 1);
                WalletBalanceComposableKt.b((String) this.c, this.b, (Function1) this.e, (Composer) obj, iUpdateChangedFlags8);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ y4(Serializable serializable, boolean z, Function function, int i, int i2) {
        this.f20073a = i2;
        this.c = serializable;
        this.b = z;
        this.e = function;
        this.d = i;
    }

    public /* synthetic */ y4(Object obj, Object obj2, boolean z, int i, int i2) {
        this.f20073a = i2;
        this.c = obj;
        this.e = obj2;
        this.b = z;
        this.d = i;
    }

    public /* synthetic */ y4(boolean z, Object obj, Object obj2, int i, int i2) {
        this.f20073a = i2;
        this.b = z;
        this.c = obj;
        this.e = obj2;
        this.d = i;
    }
}
