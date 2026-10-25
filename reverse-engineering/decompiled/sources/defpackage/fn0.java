package defpackage;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.profile.ProfileDrawerCardAvatarKt;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusReserveTicketActivationScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.NewPremiumBusReserveTicketActivationState;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.livetrackinghandler.PremiumBusLiveTrackingState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.components.map.ChaloMapUIState;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fn0 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15658a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fn0(float f, float f2, NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState, Function1 function1) {
        this.b = f;
        this.c = f2;
        this.d = newPremiumBusReserveTicketActivationState;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f15658a;
        Unit unit = Unit.f17538a;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i) {
            case 0:
                NewPremiumBusReserveTicketActivationState newPremiumBusReserveTicketActivationState = (NewPremiumBusReserveTicketActivationState) obj5;
                Function1 function1 = (Function1) obj4;
                PaddingValues it = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(it, "it");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= composer.changed(it) ? 4 : 2;
                }
                if (!composer.shouldExecute((iIntValue & 19) != 18, iIntValue & 1)) {
                    composer.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1548337181, iIntValue, -1, "app.chalo.premiumbus.prebookedtickets.newactivation.NewPremiumBusActivationMapAndTicketDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NewPremiumBusReserveTicketActivationScreen.kt:445)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxSize$default(PaddingKt.padding(companion, it), 0.0f, 1, null), Dp.m7278constructorimpl(this.b - this.c));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM814height3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    PremiumBusLiveTrackingState premiumBusLiveTrackingState = newPremiumBusReserveTicketActivationState.o;
                    ChaloMapUIState chaloMapUIState = newPremiumBusReserveTicketActivationState.p;
                    if (premiumBusLiveTrackingState != null) {
                        composer.startReplaceGroup(-205146501);
                        ChaloMap_androidKt.c(chaloMapUIState, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composer, 48);
                        Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.b(composer, 0).f, 0.0f, ChaloTheme.b(composer, 0).f, 0.0f, 10, null);
                        boolean zChanged = composer.changed(function1);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new qm0(function1, 14);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        boolean z = chaloMapUIState.f.f9964a;
                        boolean zChanged2 = composer.changed(function1);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new nu(function1, 27);
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        NewPremiumBusReserveTicketActivationScreenKt.d(modifierM788paddingqDBjuR0$default, function0, z, (Function1) objRememberedValue2, composer, 0);
                    } else {
                        composer.startReplaceGroup(-226818229);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
            default:
                ProfileDrawerCardData profileDrawerCardData = (ProfileDrawerCardData) obj5;
                IconType iconType = (IconType) obj4;
                BoxScope ProfileCompletionTracker = (BoxScope) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Set set = ProfileDrawerCardAvatarKt.f3591a;
                Intrinsics.i(ProfileCompletionTracker, "$this$ProfileCompletionTracker");
                if (!composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                    composer2.skipToGroupEnd();
                } else {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1242858191, iIntValue2, -1, "app.chalo.home.ui.profile.ProfileDrawerCardAvatar.<anonymous> (ProfileDrawerCardAvatar.kt:64)");
                    }
                    ProfileDrawerCardAvatarKt.a(profileDrawerCardData.b, this.b, iconType, this.c, null, composer2, 0, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ fn0(ProfileDrawerCardData profileDrawerCardData, float f, IconType iconType, float f2) {
        this.d = profileDrawerCardData;
        this.b = f;
        this.e = iconType;
        this.c = f2;
    }
}
