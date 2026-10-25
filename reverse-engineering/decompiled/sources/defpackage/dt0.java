package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDefaultLegCardKt;
import app.chalo.premiumbus.prebookedtickets.newactivation.PostValidationScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dt0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15491a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ IconType f;

    public /* synthetic */ dt0(int i, IconType iconType, String str, String str2, String str3) {
        this.f15491a = 0;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = iconType;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15491a) {
            case 0:
                ((Integer) obj2).intValue();
                PostValidationScreenKt.h(this.c, this.d, this.e, this.f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1058577622, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsAutoLegSection.<anonymous> (TripPlannerDetailsScreen.kt:621)");
                    }
                    String strC = StringResourcesHelperKt.c(StringEnum.TO_SMALL, new Object[0], composer, 6);
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, ChaloTheme.b(composer, 0).f, 0.0f, 11, null);
                    int i = this.b;
                    TripPlannerDefaultLegCardKt.a(strC, this.c, this.d, this.e, pk0.d("PL_Trip_Itinerary_Leg_", i, modifierM788paddingqDBjuR0$default), this.f, i, null, null, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368926887, iIntValue2, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsTaxiLegSection.<anonymous> (TripPlannerDetailsScreen.kt:655)");
                    }
                    String strC2 = StringResourcesHelperKt.c(StringEnum.TO_SMALL, new Object[0], composer2, 6);
                    Modifier modifierM788paddingqDBjuR0$default2 = PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, ChaloTheme.b(composer2, 0).f, 0.0f, 11, null);
                    int i2 = this.b;
                    TripPlannerDefaultLegCardKt.a(strC2, this.c, this.d, this.e, pk0.d("PL_Trip_Itinerary_Leg_", i2, modifierM788paddingqDBjuR0$default2), this.f, i2, null, null, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ dt0(int i, String str, String str2, String str3, IconType iconType, int i2) {
        this.f15491a = i2;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = iconType;
    }
}
