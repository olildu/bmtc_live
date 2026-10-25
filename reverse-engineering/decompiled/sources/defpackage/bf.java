package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import app.chalo.compose.components.ChaloRoundedCardKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.data.model.app.response.BannerDataResponseAppModel;
import app.chalo.home.data.model.app.response.BannerUiDataAppModel;
import app.chalo.home.ui.chalobus.ChaloBusPassHistory;
import app.chalo.home.ui.chalobus.ChaloBusScreenHeaderLayoutKt;
import app.chalo.home.ui.chalobus.ChaloBusScreenUIKt;
import app.chalo.home.ui.chalobus.ChaloBusViewIntent;
import app.chalo.ncmc.ui.landing.compose.CardInfoLandingScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbBulkBookingRideDetailsScreenKt;
import app.chalo.premiumbus.bulkbookingridedetails.ui.PbPassInfoBanner;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.PremiumBusPostActivationStopDetails;
import app.chalo.wallet.ui.promotionscardcontainer.PromotionsCardContainerKt;
import app.chalo.walletframework.wallet.domain.model.PromotionCardItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bf implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11191a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ bf(int i, List list, Function1 function1) {
        this.f11191a = i;
        this.b = list;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        TextStyle bodyLarge;
        int i = this.f11191a;
        final int i2 = 2;
        Unit unit = Unit.f17538a;
        final Function1 function1 = this.c;
        final List list = this.b;
        final int i3 = 1;
        final int i4 = 0;
        switch (i) {
            case 0:
                PagerScope HorizontalPager = (PagerScope) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(733778781, iIntValue2, -1, "app.chalo.ncmc.ui.landing.compose.SwipableCards.<anonymous>.<anonymous> (CardInfoLandingScreen.kt:307)");
                }
                String str = (String) list.get(iIntValue);
                boolean zChanged = composer.changed(function1);
                if ((((iIntValue2 & 112) ^ 48) <= 32 || !composer.changed(iIntValue)) && (iIntValue2 & 48) != 32) {
                    i3 = 0;
                }
                int i5 = (zChanged ? 1 : 0) | i3;
                Object objRememberedValue = composer.rememberedValue();
                if (i5 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new cf(iIntValue, 0, function1);
                    composer.updateRememberedValue(objRememberedValue);
                }
                CardInfoLandingScreenKt.i(0, composer, null, str, (Function0) objRememberedValue);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 1:
                PagerScope HorizontalPager2 = (PagerScope) obj;
                final int iIntValue3 = ((Integer) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager2, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1156357635, iIntValue4, -1, "app.chalo.home.ui.chalobus.ChaloBusRollOverBannerSection.<anonymous>.<anonymous> (ChaloBusScreenHeaderLayout.kt:291)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                BannerUiDataAppModel bannerUiDataAppModel = ((BannerDataResponseAppModel) list.get(iIntValue3)).c;
                int i6 = (composer2.changed(function1) ? 1 : 0) | (composer2.changedInstance(list) ? 1 : 0);
                if ((((iIntValue4 & 112) ^ 48) <= 32 || !composer2.changed(iIntValue3)) && (iIntValue4 & 48) != 32) {
                    i3 = 0;
                }
                int i7 = i6 | i3;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (i7 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: hh
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    function1.invoke(new ChaloBusViewIntent.OnRollOverBannerClickedIntent((BannerDataResponseAppModel) list.get(iIntValue3)));
                                    break;
                                case 1:
                                    function1.invoke(list.get(iIntValue3));
                                    break;
                                default:
                                    function1.invoke(list.get(iIntValue3));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                ChaloBusScreenHeaderLayoutKt.b(modifierFillMaxWidth$default, bannerUiDataAppModel, (Function0) objRememberedValue2, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 2:
                PagerScope HorizontalPager3 = (PagerScope) obj;
                final int iIntValue5 = ((Integer) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager3, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2032878584, iIntValue6, -1, "app.chalo.home.ui.chalobus.ChaloBusPassesCarousel.<anonymous>.<anonymous> (ChaloBusScreenUI.kt:1479)");
                }
                ChaloBusPassHistory chaloBusPassHistory = (ChaloBusPassHistory) list.get(iIntValue5);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                int i8 = (composer3.changed(function1) ? 1 : 0) | (composer3.changedInstance(list) ? 1 : 0) | (((((iIntValue6 & 112) ^ 48) > 32 && composer3.changed(iIntValue5)) || (iIntValue6 & 48) == 32) ? 1 : 0);
                Object objRememberedValue3 = composer3.rememberedValue();
                if (i8 != 0 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: hh
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    function1.invoke(new ChaloBusViewIntent.OnRollOverBannerClickedIntent((BannerDataResponseAppModel) list.get(iIntValue5)));
                                    break;
                                case 1:
                                    function1.invoke(list.get(iIntValue5));
                                    break;
                                default:
                                    function1.invoke(list.get(iIntValue5));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                ChaloBusScreenUIKt.a(chaloBusPassHistory, modifierFillMaxWidth$default2, (Function0) objRememberedValue3, composer3, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 3:
                PagerScope HorizontalPager4 = (PagerScope) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager4, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2052524621, iIntValue8, -1, "app.chalo.premiumbus.bulkbookingridedetails.ui.PremiumBusRollOverAndDateChangeBanner.<anonymous>.<anonymous> (PbBulkBookingRideDetailsScreen.kt:1456)");
                }
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                PbPassInfoBanner pbPassInfoBanner = (PbPassInfoBanner) list.get(iIntValue7);
                boolean zChanged2 = composer4.changed(function1);
                Object objRememberedValue4 = composer4.rememberedValue();
                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new sn0(function1, 10);
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                PbBulkBookingRideDetailsScreenKt.f(modifierFillMaxWidth$default3, pbPassInfoBanner, (Function1) objRememberedValue4, composer4, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
            case 4:
                Modifier modifier = (Modifier) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                Composer composer5 = (Composer) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                Intrinsics.i(modifier, "modifier");
                int i9 = (iIntValue10 & 6) == 0 ? iIntValue10 | (composer5.changed(modifier) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i9 |= composer5.changed(iIntValue9) ? 32 : 16;
                }
                if (!composer5.shouldExecute((i9 & 147) != 146, i9 & 1)) {
                    composer5.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1869296369, i9, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.PostActivationRouteDetails.<anonymous>.<anonymous> (PostValidationScreen.kt:517)");
                    }
                    PremiumBusPostActivationStopDetails premiumBusPostActivationStopDetails = (PremiumBusPostActivationStopDetails) list.get(iIntValue9);
                    if (premiumBusPostActivationStopDetails.c) {
                        composer5.startReplaceGroup(337968079);
                        bodyLarge = ChaloTheme.e(composer5, 0).getHeadlineMedium();
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(338041332);
                        bodyLarge = ChaloTheme.e(composer5, 0).getBodyLarge();
                        composer5.endReplaceGroup();
                    }
                    TextStyle textStyle = bodyLarge;
                    MutableInteractionSource MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                    boolean zChanged3 = composer5.changed(function1) | composer5.changedInstance(premiumBusPostActivationStopDetails);
                    Object objRememberedValue5 = composer5.rememberedValue();
                    if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new fr0(6, function1, premiumBusPostActivationStopDetails);
                        composer5.updateRememberedValue(objRememberedValue5);
                    }
                    Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(ClickableKt.m295clickableO2vRcR0$default(modifier, MutableInteractionSource, null, false, null, null, (Function0) objRememberedValue5, 28, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer5, 0);
                    int i10 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierFillMaxWidth$default4);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer5);
                    pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i10), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2623TextNvy7gAk(premiumBusPostActivationStopDetails.b, null, ChaloTheme.a(composer5, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer5, 0, 0, 131066);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composer5, 0).e), composer5, 0);
                    if (premiumBusPostActivationStopDetails.c) {
                        composer5.startReplaceGroup(-1172785237);
                        ChaloRoundedCardKt.b(null, ChaloTheme.d(composer5, 0).b, 0.0f, 0.0f, ComposableLambdaKt.rememberComposableLambda(749329343, true, new la0(premiumBusPostActivationStopDetails, 15), composer5, 54), composer5, 24576, 13);
                    } else {
                        composer5.startReplaceGroup(-1194649475);
                    }
                    composer5.endReplaceGroup();
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composer5, 0).l), composer5, 0);
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                PagerScope HorizontalPager5 = (PagerScope) obj;
                final int iIntValue11 = ((Integer) obj2).intValue();
                Composer composer6 = (Composer) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager5, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(235322368, iIntValue12, -1, "app.chalo.wallet.ui.promotionscardcontainer.PromotionsSection.<anonymous>.<anonymous> (PromotionsCardContainer.kt:46)");
                }
                PromotionCardItem promotionCardItem = (PromotionCardItem) list.get(iIntValue11);
                int i11 = (composer6.changed(function1) ? 1 : 0) | (composer6.changedInstance(list) ? 1 : 0);
                if ((((iIntValue12 & 112) ^ 48) <= 32 || !composer6.changed(iIntValue11)) && (iIntValue12 & 48) != 32) {
                    i3 = 0;
                }
                int i12 = i11 | i3;
                Object objRememberedValue6 = composer6.rememberedValue();
                if (i12 != 0 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: hh
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    function1.invoke(new ChaloBusViewIntent.OnRollOverBannerClickedIntent((BannerDataResponseAppModel) list.get(iIntValue11)));
                                    break;
                                case 1:
                                    function1.invoke(list.get(iIntValue11));
                                    break;
                                default:
                                    function1.invoke(list.get(iIntValue11));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composer6.updateRememberedValue(objRememberedValue6);
                }
                PromotionsCardContainerKt.b(promotionCardItem, (Function0) objRememberedValue6, composer6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                break;
        }
        return unit;
    }
}
