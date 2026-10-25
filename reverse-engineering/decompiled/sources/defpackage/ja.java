package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.window.PopupPositionProvider;
import app.chalo.compose.components.ChaloSearchBarComposableKt;
import app.chalo.instantticket.data.model.app.response.PassengerSelectionPolicy;
import app.chalo.instantticket.ui.faredetails.compose.PassengerDetailsViewKt;
import app.chalo.wallet.ui.access.WalletAccessBaseScreenKt;
import app.chalo.wallet.ui.access.WalletAccessSheet;
import app.chalo.wallet.ui.access.WalletAutoReclaimStatus;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ja implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17385a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ja(Modifier modifier, TextFieldValue textFieldValue, boolean z, String str, Function1 function1, Function0 function0, Function0 function2, int i) {
        this.e = modifier;
        this.f = textFieldValue;
        this.b = z;
        this.g = str;
        this.h = function1;
        this.c = function0;
        this.i = function2;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17385a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return BasicTooltipKt.TooltipPopup$lambda$10((PopupPositionProvider) this.e, (TooltipState) this.f, (Function0) this.c, (CoroutineScope) this.g, this.b, (MutableState) this.h, (Function2) this.i, this.d, (Composer) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                ChaloSearchBarComposableKt.a((Modifier) this.e, (TextFieldValue) this.f, this.b, (String) this.g, (Function1) this.h, (Function0) this.c, (Function0) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 2:
                int iIntValue2 = ((Integer) obj2).intValue();
                return IconButtonKt.IconButtonImpl$lambda$4((Modifier) this.e, (Function0) this.c, this.b, (Shape) this.f, (IconButtonColors) this.g, (MutableInteractionSource) this.h, (Function2) this.i, this.d, (Composer) obj, iIntValue2);
            case 3:
                ((Integer) obj2).getClass();
                PassengerDetailsViewKt.b((Modifier) this.e, (List) this.f, this.b, (PassengerSelectionPolicy) this.c, (Function1) this.g, (Function1) this.h, (Function1) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).getClass();
                WalletAccessBaseScreenKt.e(this.b, (WalletAccessSheet) this.e, (String) this.f, (String) this.c, (Function1) this.g, (WalletAutoReclaimStatus) this.h, (Modifier) this.i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ ja(Modifier modifier, List list, boolean z, PassengerSelectionPolicy passengerSelectionPolicy, Function1 function1, Function1 function2, Function1 function3, int i) {
        this.e = modifier;
        this.f = list;
        this.b = z;
        this.c = passengerSelectionPolicy;
        this.g = function1;
        this.h = function2;
        this.i = function3;
        this.d = i;
    }

    public /* synthetic */ ja(Modifier modifier, Function0 function0, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i) {
        this.e = modifier;
        this.c = function0;
        this.b = z;
        this.f = shape;
        this.g = iconButtonColors;
        this.h = mutableInteractionSource;
        this.i = function2;
        this.d = i;
    }

    public /* synthetic */ ja(PopupPositionProvider popupPositionProvider, TooltipState tooltipState, Function0 function0, CoroutineScope coroutineScope, boolean z, MutableState mutableState, Function2 function2, int i) {
        this.e = popupPositionProvider;
        this.f = tooltipState;
        this.c = function0;
        this.g = coroutineScope;
        this.b = z;
        this.h = mutableState;
        this.i = function2;
        this.d = i;
    }

    public /* synthetic */ ja(boolean z, WalletAccessSheet walletAccessSheet, String str, String str2, Function1 function1, WalletAutoReclaimStatus walletAutoReclaimStatus, Modifier modifier, int i) {
        this.b = z;
        this.e = walletAccessSheet;
        this.f = str;
        this.c = str2;
        this.g = function1;
        this.h = walletAutoReclaimStatus;
        this.i = modifier;
        this.d = i;
    }
}
