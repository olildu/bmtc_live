package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.ChaloUserReviewFormComposableKt;
import app.chalo.compose.components.bottomsheet.UserRatingBottomSheetKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.livetracking.tripplanner.ui.details.compose.component.TripPlannerDefaultLegCardKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11346a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ IconType e;

    public /* synthetic */ cn(int i, IconType iconType, String str, String str2) {
        this.f11346a = 1;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = iconType;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11346a) {
            case 0:
                ((Integer) obj2).intValue();
                ChaloUserReviewFormComposableKt.b(this.e, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
            case 1:
                Composer composer = (Composer) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-269821139, iIntValue, -1, "app.chalo.livetracking.tripplanner.ui.details.compose.TripPlannerDetailsWalkLegSection.<anonymous> (TripPlannerDetailsScreen.kt:588)");
                    }
                    String strC = StringResourcesHelperKt.c(StringEnum.TO_SMALL, new Object[0], composer, 6);
                    Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ChaloTheme.b(composer, 0).f, 0.0f, 11, null);
                    int i = this.b;
                    TripPlannerDefaultLegCardKt.a(strC, this.c, this.d, null, pk0.d("PL_Trip_Itinerary_Leg_", i, modifierM788paddingqDBjuR0$default), this.e, i, null, null, composer, 3072);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            default:
                ((Integer) obj2).intValue();
                UserRatingBottomSheetKt.b(this.e, this.c, this.d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.b | 1));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ cn(IconType iconType, String str, String str2, int i, int i2) {
        this.f11346a = i2;
        this.e = iconType;
        this.c = str;
        this.d = str2;
        this.b = i;
    }
}
