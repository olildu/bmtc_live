package defpackage;

import androidx.compose.material3.DateInputKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerFormatter;
import androidx.compose.material3.SelectableDates;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import app.chalo.checkout.ui.payment.PaymentMethodListItemKt;
import app.chalo.checkout.ui.screen.payment.CardIconUIState;
import app.chalo.checkout.ui.screen.payment.CardLabelUiState;
import app.chalo.checkout.ui.screen.payment.ModeItemDetailsUiSpec;
import app.chalo.home.PendingRideFeedbackStickyBannerUIState;
import app.chalo.home.SnackBarState;
import app.chalo.home.contract.HomeScreenInfoHelper;
import app.chalo.home.ui.base.HomeScreenMainDecomposeKt;
import app.chalo.home.ui.compose.UserProfilingChaloBusStickyBannerUIState;
import app.chalo.home.ui.compose.UserProfilingHomeStickyBannerUIState;
import app.chalo.homescreen.data.model.app.NavigationTabAppModel;
import app.chalo.premiumbus.ui.stopselection.compose.PremiumBusStopSelectionScreenKt;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.utils.timeutil.TimeUtilsContract;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class er implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15581a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ er(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2) {
        this.f15581a = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.j = obj8;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15581a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ComposableLambdaImpl.invoke$lambda$6((ComposableLambdaImpl) this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.b, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DateInputKt.DateInputContent$lambda$3((Long) this.c, (Function1) this.d, (CalendarModel) this.e, (IntRange) this.f, (DatePickerFormatter) this.g, (SelectableDates) this.h, (DatePickerColors) this.i, (FocusRequester) this.j, this.b, (Composer) obj, iIntValue2);
            case 2:
                ((Integer) obj2).intValue();
                HomeScreenMainDecomposeKt.a((NavigationTabAppModel) this.c, (List) this.d, (HomeScreenInfoHelper) this.e, (SnackBarState) this.f, (UserProfilingHomeStickyBannerUIState) this.g, (UserProfilingChaloBusStickyBannerUIState) this.h, (PendingRideFeedbackStickyBannerUIState) this.i, (Function1) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            case 3:
                ((Integer) obj2).getClass();
                PaymentMethodListItemKt.b((Modifier) this.c, (ModeItemDetailsUiSpec) this.d, (TextUIState.ChaloTextUIState) this.e, (CardIconUIState) this.f, (ImageUIState) this.g, (TextUIState.ChaloTextUIState) this.h, (CardLabelUiState) this.i, (TextUIState.ChaloTextUIState) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
            default:
                ((Integer) obj2).getClass();
                PremiumBusStopSelectionScreenKt.m((String) this.c, (String) this.d, (TimeUtilsContract) this.e, (List) this.f, (Function1) this.g, (Function1) this.h, (Function1) this.i, (Function0) this.j, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                return Unit.f17538a;
        }
    }
}
