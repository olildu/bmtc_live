package defpackage;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.RippleConfiguration;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1;
import androidx.compose.material3.Typography;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import app.chalo.ads.UnifiedAdSlot;
import app.chalo.checkout.ui.payment.PaymentMethodListItemKt;
import app.chalo.checkout.ui.screen.payment.CardIconUIState;
import app.chalo.checkout.ui.screen.payment.CardLabelUiState;
import app.chalo.checkout.ui.screen.payment.ModeItemDetailsUiSpec;
import app.chalo.compose.components.ChaloWidgetCardKt;
import app.chalo.compose.components.userprofile.UserProfilePicComposableUIState;
import app.chalo.compose.theme.ChaloColor;
import app.chalo.compose.theme.ChaloDimens;
import app.chalo.compose.theme.ChaloElevation;
import app.chalo.compose.theme.ChaloShape;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.data.ChaloTextWithBackgroundData;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.base.HomeComponent;
import app.chalo.home.ui.base.HomeScreenMainDecomposeKt;
import app.chalo.home.ui.compose.UserProfilingBottomSheetKt;
import app.chalo.home.ui.regularbus.RegularBusUnifiedAdRenderer_androidKt;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.location.LatLng;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationBottomSheetContentKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusPostBookingStopSchedule;
import app.chalo.premiumbus.ui.stopdetails.PBBusStopImageType;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.text.TextUIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class km implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17511a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ km(WindowInsets windowInsets, Function2 function2, Function2 function3, Function2 function4, int i, Function2 function5, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, Function2 function6) {
        this.f17511a = 8;
        this.c = windowInsets;
        this.i = function2;
        this.d = function3;
        this.e = function4;
        this.b = i;
        this.f = function5;
        this.g = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        this.h = function6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f17511a;
        Unit unit = Unit.f17538a;
        int i2 = this.b;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ProvidableCompositionLocal providableCompositionLocal = ChaloThemeKt.f1921a;
                ChaloThemeKt.a((Typography) obj9, (ChaloElevation) obj8, (ChaloShape) obj7, (ChaloDimens) obj6, (ChaloColor) obj5, (RippleConfiguration) obj4, (Function2) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 1:
                ((Integer) obj2).getClass();
                ChaloWidgetCardKt.b((Modifier) obj9, (Color) obj8, (String) obj7, (ChaloTextWithBackgroundData) obj6, (List) obj5, (List) obj4, (IconType) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$5((ComposableLambdaImpl) obj9, this.d, this.e, this.f, this.g, this.h, this.i, this.b, (Composer) obj, iIntValue);
            case 3:
                ((Integer) obj2).intValue();
                HomeScreenMainDecomposeKt.f((HomeComponent) obj9, (NavigationTabAppModel) obj8, (NavigationTabAppModel) obj7, (PaddingValues) obj6, (List) obj5, (HomeScreenInfoHelper) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 4:
                ((Integer) obj2).intValue();
                NewPremiumBusActivationBottomSheetContentKt.l((String) obj9, (String) obj8, (String) obj7, (String) obj6, (Integer) obj5, (Function0) obj4, (PremiumBusPostBookingStopSchedule) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 5:
                ((Integer) obj2).getClass();
                productbooking_release.a((Modifier) obj9, (String) obj8, (String) obj7, (LatLng) obj6, (PBBusStopImageType) obj5, (Function1) obj4, (Function1) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 6:
                ((Integer) obj2).getClass();
                PaymentMethodListItemKt.a((Modifier) obj9, (ModeItemDetailsUiSpec) obj8, (CardIconUIState) obj7, (TextUIState.ChaloTextUIState) obj6, (TextUIState.ChaloTextUIState) obj5, (CardLabelUiState) obj4, (TextUIState.ChaloTextUIState) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 7:
                ((Integer) obj2).getClass();
                RegularBusUnifiedAdRenderer_androidKt.a((String) obj9, (UnifiedAdSlot) obj8, (Modifier) obj7, (Function2) obj3, (Function1) obj6, (Function0) obj5, (Function1) obj4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
            case 8:
                return ScaffoldKt.ScaffoldLayout_FMILGgc$lambda$15$lambda$14((WindowInsets) obj9, (Function2) obj3, (Function2) obj8, (Function2) obj7, this.b, (Function2) obj6, (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) obj5, (Function2) obj4, (SubcomposeMeasureScope) obj, (Constraints) obj2);
            default:
                ((Integer) obj2).intValue();
                UserProfilingBottomSheetKt.a((UserProfilePicComposableUIState) obj9, (String) obj8, (String) obj7, (String) obj6, (String) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                return unit;
        }
    }

    public /* synthetic */ km(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2) {
        this.f17511a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.b = i;
    }

    public /* synthetic */ km(String str, UnifiedAdSlot unifiedAdSlot, Modifier modifier, Function2 function2, Function1 function1, Function0 function0, Function1 function3, int i) {
        this.f17511a = 7;
        this.c = str;
        this.d = unifiedAdSlot;
        this.e = modifier;
        this.i = function2;
        this.f = function1;
        this.g = function0;
        this.h = function3;
        this.b = i;
    }
}
