package defpackage;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldScrollerPosition;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import app.chalo.premiumbus.bulkbookingridedetails.data.model.app.SuperPassResponseAppModel;
import app.chalo.premiumbus.bulkbookingridedetails.ui.LinkedBookingLocalDataFetchStateLayoutType;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsTabType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ut implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19776a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    public /* synthetic */ ut(LegacyTextFieldState legacyTextFieldState, TextStyle textStyle, int i, int i2, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z, boolean z2, Function1 function1, OffsetMapping offsetMapping, Density density) {
        this.g = legacyTextFieldState;
        this.h = textStyle;
        this.e = i;
        this.f = i2;
        this.i = textFieldScrollerPosition;
        this.j = textFieldValue;
        this.k = visualTransformation;
        this.l = modifier;
        this.m = modifier2;
        this.n = modifier3;
        this.o = modifier4;
        this.p = bringIntoViewRequester;
        this.q = textFieldSelectionManager;
        this.c = z;
        this.d = z2;
        this.b = function1;
        this.r = offsetMapping;
        this.s = density;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19776a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return CoreTextFieldKt.CoreTextField$lambda$26$0((LegacyTextFieldState) this.g, (TextStyle) this.h, this.e, this.f, (TextFieldScrollerPosition) this.i, (TextFieldValue) this.j, (VisualTransformation) this.k, (Modifier) this.l, (Modifier) this.m, (Modifier) this.n, (Modifier) this.o, (BringIntoViewRequester) this.p, (TextFieldSelectionManager) this.q, this.c, this.d, this.b, (OffsetMapping) this.r, (Density) this.s, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.e | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.f);
                PbBulkBookingRideDetailsScreenKt.i((List) this.g, (List) this.h, (SuperPassResponseAppModel) this.i, (PbBulkBookingRideDetailsTabType) this.j, this.b, (List) this.k, (List) this.l, (String) this.m, (String) this.n, (Integer) this.o, (LinkedBookingLocalDataFetchStateLayoutType) this.p, (String) this.q, (List) this.r, this.c, (String) this.s, this.d, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ ut(List list, List list2, SuperPassResponseAppModel superPassResponseAppModel, PbBulkBookingRideDetailsTabType pbBulkBookingRideDetailsTabType, Function1 function1, List list3, List list4, String str, String str2, Integer num, LinkedBookingLocalDataFetchStateLayoutType linkedBookingLocalDataFetchStateLayoutType, String str3, List list5, boolean z, String str4, boolean z2, int i, int i2) {
        this.g = list;
        this.h = list2;
        this.i = superPassResponseAppModel;
        this.j = pbBulkBookingRideDetailsTabType;
        this.b = function1;
        this.k = list3;
        this.l = list4;
        this.m = str;
        this.n = str2;
        this.o = num;
        this.p = linkedBookingLocalDataFetchStateLayoutType;
        this.q = str3;
        this.r = list5;
        this.c = z;
        this.s = str4;
        this.d = z2;
        this.e = i;
        this.f = i2;
    }
}
