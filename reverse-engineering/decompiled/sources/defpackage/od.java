package defpackage;

import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import app.chalo.home.ui.common.TabHeaderKt;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.livetracking.universalsearch.ui.compose.SearchRouteItemComposableKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.BusTicketCardUIKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.RouteInfo;
import app.chalo.providers.iconassetprovider.IconType;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class od implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18588a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ od(TextFieldSelectionManager textFieldSelectionManager, LegacyTextFieldState legacyTextFieldState, boolean z, boolean z2, Function1 function1, TextFieldValue textFieldValue, OffsetMapping offsetMapping, Density density, int i) {
        this.e = textFieldSelectionManager;
        this.f = legacyTextFieldState;
        this.b = z;
        this.c = z2;
        this.g = function1;
        this.h = textFieldValue;
        this.i = offsetMapping;
        this.j = density;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18588a) {
            case 0:
                ((Integer) obj2).getClass();
                BusTicketCardUIKt.b((Modifier) this.e, (String) this.f, this.b, (RouteInfo) this.h, (String) this.g, this.c, (Function0) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            case 1:
                int iIntValue = ((Integer) obj2).intValue();
                return CoreTextFieldKt.CoreTextField$lambda$26$0$1((TextFieldSelectionManager) this.e, (LegacyTextFieldState) this.f, this.b, this.c, (Function1) this.g, (TextFieldValue) this.h, (OffsetMapping) this.i, (Density) this.j, this.d, (Composer) obj, iIntValue);
            case 2:
                ((Integer) obj2).intValue();
                SearchRouteItemComposableKt.c((Modifier) this.e, (IconType) this.h, (AnnotatedString) this.i, this.b, (List) this.j, (String) this.f, (String) this.g, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).intValue();
                TabHeaderKt.d((IconType) this.e, (Function0) this.i, (Function0) this.j, (String) this.f, (Function0) this.g, (ProfileDrawerCardData) this.h, this.b, this.c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.d | 1));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ od(Modifier modifier, IconType iconType, AnnotatedString annotatedString, boolean z, List list, String str, String str2, boolean z2, int i) {
        this.e = modifier;
        this.h = iconType;
        this.i = annotatedString;
        this.b = z;
        this.j = list;
        this.f = str;
        this.g = str2;
        this.c = z2;
        this.d = i;
    }

    public /* synthetic */ od(Modifier modifier, String str, boolean z, RouteInfo routeInfo, String str2, boolean z2, Function0 function0, Function0 function1, int i) {
        this.e = modifier;
        this.f = str;
        this.b = z;
        this.h = routeInfo;
        this.g = str2;
        this.c = z2;
        this.i = function0;
        this.j = function1;
        this.d = i;
    }

    public /* synthetic */ od(IconType iconType, Function0 function0, Function0 function1, String str, Function0 function2, ProfileDrawerCardData profileDrawerCardData, boolean z, boolean z2, int i) {
        this.e = iconType;
        this.i = function0;
        this.j = function1;
        this.f = str;
        this.g = function2;
        this.h = profileDrawerCardData;
        this.b = z;
        this.c = z2;
        this.d = i;
    }
}
