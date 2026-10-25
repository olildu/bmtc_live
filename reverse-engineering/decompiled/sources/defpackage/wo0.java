package defpackage;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.productpurchase.passselection.ui.CategorySelectionTabUIState;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wo0 implements Function5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19948a;
    public final /* synthetic */ PagerState b;

    public /* synthetic */ wo0(PagerState pagerState, int i) {
        this.f19948a = i;
        this.b = pagerState;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3;
        switch (this.f19948a) {
            case 0:
                BoxScope ChaloScrollableTabRow = (BoxScope) obj;
                String tabInfo = (String) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Composer composer = (Composer) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                Intrinsics.i(ChaloScrollableTabRow, "$this$ChaloScrollableTabRow");
                Intrinsics.i(tabInfo, "tabInfo");
                if ((iIntValue2 & 48) == 0) {
                    i = (composer.changed(tabInfo) ? 32 : 16) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= composer.changed(iIntValue) ? 256 : 128;
                }
                if (composer.shouldExecute((i & 1169) != 1168, i & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1348830521, i, -1, "app.chalo.premiumbus.ui.stopdetails.compose.PBStopDetailsTabs.<anonymous> (PBStopDetailsMainScreen.kt:301)");
                    }
                    TextKt.m2623TextNvy7gAk(tabInfo, PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composer, 0).e, ChaloTheme.b(composer, 0).f), this.b.getCurrentPage() == iIntValue ? Color.INSTANCE.m4642getWhite0d7_KjU() : Color.INSTANCE.m4631getBlack0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composer, 0)), composer, (i >> 3) & 14, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                break;
            case 1:
                BoxScope ChaloScrollableTabRow2 = (BoxScope) obj;
                CategorySelectionTabUIState tab = (CategorySelectionTabUIState) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Composer composer2 = (Composer) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                Intrinsics.i(ChaloScrollableTabRow2, "$this$ChaloScrollableTabRow");
                Intrinsics.i(tab, "tab");
                if ((iIntValue4 & 48) == 0) {
                    i2 = (composer2.changed(tab) ? 32 : 16) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 384) == 0) {
                    i2 |= composer2.changed(iIntValue3) ? 256 : 128;
                }
                if (composer2.shouldExecute((i2 & 1169) != 1168, i2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1721226142, i2, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelection.<anonymous>.<anonymous> (PassSelectionScreen.kt:167)");
                    }
                    PassSelectionScreenKt.b(tab, this.b.getCurrentPage() == iIntValue3, null, composer2, (i2 >> 3) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                break;
            default:
                BoxScope ChaloScrollableTabRow3 = (BoxScope) obj;
                String tabInfo2 = (String) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                Composer composer3 = (Composer) obj4;
                int iIntValue6 = ((Integer) obj5).intValue();
                Intrinsics.i(ChaloScrollableTabRow3, "$this$ChaloScrollableTabRow");
                Intrinsics.i(tabInfo2, "tabInfo");
                if ((iIntValue6 & 48) == 0) {
                    i3 = (composer3.changed(tabInfo2) ? 32 : 16) | iIntValue6;
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 384) == 0) {
                    i3 |= composer3.changed(iIntValue5) ? 256 : 128;
                }
                if (composer3.shouldExecute((i3 & 1169) != 1168, i3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1468996572, i3, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PremiumBusPostBoardingDetailsTabs.<anonymous> (PostValidationScreen.kt:367)");
                    }
                    TextKt.m2623TextNvy7gAk(tabInfo2, PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composer3, 0).e, ChaloTheme.b(composer3, 0).f), this.b.getCurrentPage() == iIntValue5 ? Color.INSTANCE.m4642getWhite0d7_KjU() : Color.INSTANCE.m4631getBlack0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer3, 0).getHeadlineSmall(), composer3, (i3 >> 3) & 14, 0, 131064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.f17538a;
    }
}
