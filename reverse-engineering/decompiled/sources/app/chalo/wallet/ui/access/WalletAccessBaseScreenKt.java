package app.chalo.wallet.ui.access;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.utils.SheetDefaultsHelperKt;
import app.chalo.wallet.ui.access.WalletAccessIntent;
import app.chalo.wallet.ui.base.WalletBaseComponent;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.ag1;
import defpackage.bm1;
import defpackage.dq;
import defpackage.ey0;
import defpackage.gf;
import defpackage.hn1;
import defpackage.ja;
import defpackage.pk0;
import defpackage.qb1;
import defpackage.qo;
import defpackage.xo1;
import defpackage.y4;
import defpackage.yo1;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/wallet/ui/access/WalletAccessState;", "walletAccessState", "wallet_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class WalletAccessBaseScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10788a;

        static {
            int[] iArr = new int[WalletAccessSheet.values().length];
            try {
                iArr[WalletAccessSheet.UnableToLogin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletAccessSheet.WalletNotActivated.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletAccessSheet.UserBlocked.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletAccessSheet.BackendReclaim.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletAccessSheet.AppReclaim.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WalletAccessSheet.NeedInternet.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[WalletAccessSheet.FullKYCNeeded.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[WalletAccessSheet.ChaloTimeUnavailable.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[WalletAccessSheet.WalletActivated.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[WalletAccessSheet.QuickPayActivated.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f10788a = iArr;
        }
    }

    public static final void a(boolean z, WalletAutoReclaimStatus walletAutoReclaimStatus, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-835290517);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(walletAutoReclaimStatus) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-835290517, i2, -1, "app.chalo.wallet.ui.access.BackedReclaimBottomSheets (WalletAccessBaseScreen.kt:374)");
            }
            if (walletAutoReclaimStatus instanceof WalletAutoReclaimStatus.AutoReclaimInProgress) {
                composerStartRestartGroup.startReplaceGroup(901029374);
                IconType iconType = IconType.WALLET_AUTO_RECLAIM_PROGRESS;
                String strC = StringResourcesHelperKt.c(StringEnum.CHALO_PAY_WILL_BE_READY_SOON, new Object[0], composerStartRestartGroup, 6);
                String str = ((WalletAutoReclaimStatus.AutoReclaimInProgress) walletAutoReclaimStatus).f10811a;
                String strC2 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6);
                int i3 = i2 & 896;
                boolean z2 = i3 == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new xo1(function1, 4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean z3 = i3 == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new xo1(function1, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                f(z, iconType, strC, str, strC2, function0, null, null, null, (Function0) objRememberedValue2, composerStartRestartGroup, (i2 & 14) | 113246256, 64);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.d(walletAutoReclaimStatus, WalletAutoReclaimStatus.AutoReclaimLimitExceeded.f10812a) && !Intrinsics.d(walletAutoReclaimStatus, WalletAutoReclaimStatus.TransferChaloPay.f10813a)) {
                    throw pk0.p(composerStartRestartGroup, 444705155);
                }
                composerStartRestartGroup.startReplaceGroup(901891515);
                IconType iconType2 = IconType.WALLET_AUTO_RECLAIM_ERROR;
                String strC3 = StringResourcesHelperKt.c(StringEnum.MOVE_CHALO_PAY_TO_THIS_DEVICE, new Object[0], composerStartRestartGroup, 6);
                String strC4 = StringResourcesHelperKt.c(StringEnum.TRANSFER_CHALO_PAY_MSG, new Object[0], composerStartRestartGroup, 6);
                String strC5 = StringResourcesHelperKt.c(StringEnum.TRANSFER_CHALO_PAY, new Object[0], composerStartRestartGroup, 6);
                String strC6 = StringResourcesHelperKt.c(StringEnum.LATER, new Object[0], composerStartRestartGroup, 6);
                int i4 = i2 & 896;
                boolean z4 = i4 == 256;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new xo1(function1, 6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function2 = (Function0) objRememberedValue3;
                boolean z5 = i4 == 256;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new xo1(function1, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function0 function3 = (Function0) objRememberedValue4;
                boolean z6 = i4 == 256;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new xo1(function1, 8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                f(z, iconType2, strC3, strC4, strC5, function2, null, strC6, function3, (Function0) objRememberedValue5, composerStartRestartGroup, (i2 & 14) | 48, 64);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new y4(z, walletAutoReclaimStatus, function1, i, 9));
        }
    }

    public static final void b(WalletAccessState walletAccessState, Function1 function1, Function2 function2, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-258838716);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(walletAccessState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-258838716, i2, -1, "app.chalo.wallet.ui.access.WalletAccessBaseFullScreen (WalletAccessBaseScreen.kt:107)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 6) & 14));
            if (walletAccessState.h == null) {
                composerStartRestartGroup.startReplaceGroup(973715861);
            } else {
                composerStartRestartGroup.startReplaceGroup(973715862);
                Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i4 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM264backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion3, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i4), composerM3915constructorimpl2));
                e(true, walletAccessState.h, walletAccessState.j, walletAccessState.k, function1, walletAccessState.m, boxScopeInstance.align(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), companion2.getCenter()), composerStartRestartGroup, ((i2 << 9) & 57344) | 6);
                composerStartRestartGroup.endNode();
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new yo1(walletAccessState, function1, function2, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final WalletBaseComponent walletBaseComponent, Function2 screenContent, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(screenContent, "screenContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(665134964);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(walletBaseComponent) : composerStartRestartGroup.changedInstance(walletBaseComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(screenContent) ? 32 : 16;
        }
        boolean z = false;
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(665134964, i2, -1, "app.chalo.wallet.ui.access.WalletAccessBaseScreen (WalletAccessBaseScreen.kt:48)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(walletBaseComponent.m, composerStartRestartGroup);
            SheetState sheetStateA = SheetDefaultsHelperKt.a(true, null, SheetValue.Hidden, false, composerStartRestartGroup, 3462, 50);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            int i4 = i2 & 14;
            boolean zChangedInstance = (i4 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(walletBaseComponent))) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateA);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new WalletAccessBaseScreenKt$WalletAccessBaseScreen$1$1(walletBaseComponent, coroutineScope, sheetStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(walletBaseComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i4);
            if (((WalletAccessState) mutableStateA.getValue()).g) {
                composerStartRestartGroup.startReplaceGroup(-1942430559);
                i3 = i4;
                ChaloLoadingDialogKt.b(StringResourcesHelperKt.c(StringEnum.WALLET_STATUS_LOADING_MESSAGE, new Object[0], composerStartRestartGroup, 6), false, null, composerStartRestartGroup, 0, 6);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                i3 = i4;
                composerStartRestartGroup.startReplaceGroup(-1945453586);
            }
            composerStartRestartGroup.endReplaceGroup();
            Boolean bool = ((WalletAccessState) mutableStateA.getValue()).f10810a;
            if (Intrinsics.d(bool, Boolean.TRUE)) {
                composerStartRestartGroup.startReplaceGroup(-1942227788);
                WalletAccessState walletAccessState = (WalletAccessState) mutableStateA.getValue();
                if (i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(walletBaseComponent))) {
                    z = true;
                }
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue3 == companion.getEmpty()) {
                    final int i5 = 0;
                    objRememberedValue3 = new Function1() { // from class: wo1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            WalletAccessIntent it = (WalletAccessIntent) obj;
                            switch (i5) {
                                case 0:
                                    Intrinsics.i(it, "it");
                                    walletBaseComponent.G0(it);
                                    break;
                                default:
                                    Intrinsics.i(it, "it");
                                    walletBaseComponent.G0(it);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                b(walletAccessState, (Function1) objRememberedValue3, screenContent, composerStartRestartGroup, (i2 << 3) & 896);
                composerStartRestartGroup.endReplaceGroup();
            } else if (Intrinsics.d(bool, Boolean.FALSE)) {
                composerStartRestartGroup.startReplaceGroup(-1941991878);
                WalletAccessState walletAccessState2 = (WalletAccessState) mutableStateA.getValue();
                if (i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(walletBaseComponent))) {
                    z = true;
                }
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue4 == companion.getEmpty()) {
                    final int i6 = 1;
                    objRememberedValue4 = new Function1() { // from class: wo1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            WalletAccessIntent it = (WalletAccessIntent) obj;
                            switch (i6) {
                                case 0:
                                    Intrinsics.i(it, "it");
                                    walletBaseComponent.G0(it);
                                    break;
                                default:
                                    Intrinsics.i(it, "it");
                                    walletBaseComponent.G0(it);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                d(walletAccessState2, sheetStateA, (Function1) objRememberedValue4, screenContent, composerStartRestartGroup, (i2 << 6) & 7168);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (bool != null) {
                    throw pk0.p(composerStartRestartGroup, -755390556);
                }
                composerStartRestartGroup.startReplaceGroup(-1941709716);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hn1(walletBaseComponent, screenContent, i, 7));
        }
    }

    public static final void d(WalletAccessState walletAccessState, SheetState sheetState, Function1 function1, Function2 function2, Composer composer, int i) {
        int i2;
        SheetState sheetState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1732470119);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(walletAccessState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            sheetState2 = sheetState;
            i2 |= composerStartRestartGroup.changed(sheetState2) ? 32 : 16;
        } else {
            sheetState2 = sheetState;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1732470119, i2, -1, "app.chalo.wallet.ui.access.WalletAccessBaseWithBottomSheet (WalletAccessBaseScreen.kt:143)");
            }
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 9) & 14));
            if (walletAccessState.h == null) {
                composerStartRestartGroup.startReplaceGroup(-604393656);
            } else {
                composerStartRestartGroup.startReplaceGroup(-604393655);
                ChaloRoundedBottomSheetKt.a(sheetState2, null, false, false, false, ComposableLambdaKt.rememberComposableLambda(-109047414, true, new qb1(12, walletAccessState, function1), composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 3) & 14) | 196992, 26);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ey0(i, 12, walletAccessState, sheetState, function1, function2));
        }
    }

    public static final void e(boolean z, WalletAccessSheet walletAccessSheet, String str, String str2, Function1 function1, WalletAutoReclaimStatus walletAutoReclaimStatus, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        WalletAutoReclaimStatus walletAutoReclaimStatus2;
        String strC;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1154134241);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(walletAccessSheet.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(walletAutoReclaimStatus) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            modifier2 = modifier;
            i2 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
        } else {
            modifier2 = modifier;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1154134241, i2, -1, "app.chalo.wallet.ui.access.WalletAccessSheetContent (WalletAccessBaseScreen.kt:183)");
            }
            switch (WhenMappings.f10788a[walletAccessSheet.ordinal()]) {
                case 1:
                    walletAutoReclaimStatus2 = walletAutoReclaimStatus;
                    composerStartRestartGroup.startReplaceGroup(-1599532421);
                    IconType iconType = IconType.CHALO_PAY_NOT_ACTIVATE;
                    String strC2 = StringResourcesHelperKt.c(StringEnum.UNABLE_TO_LOGIN_ERROR_TITLE, new Object[0], composerStartRestartGroup, 6);
                    String strC3 = StringResourcesHelperKt.c(StringEnum.UNABLE_TO_LOGIN_ERROR_MESSAGE, new Object[0], composerStartRestartGroup, 6);
                    String strC4 = StringResourcesHelperKt.c(StringEnum.RETRY, new Object[0], composerStartRestartGroup, 6);
                    Locale locale = Locale.ROOT;
                    String upperCase = strC4.toUpperCase(locale);
                    Intrinsics.h(upperCase, "toUpperCase(...)");
                    String upperCase2 = StringResourcesHelperKt.c(StringEnum.LATER, new Object[0], composerStartRestartGroup, 6).toUpperCase(locale);
                    Intrinsics.h(upperCase2, "toUpperCase(...)");
                    int i3 = i2 & 57344;
                    boolean z2 = i3 == 16384;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new xo1(function1, 9);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    boolean z3 = i3 == 16384;
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new bm1(function1, 25);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    f(z, iconType, strC2, strC3, upperCase, function0, modifier, upperCase2, (Function0) objRememberedValue2, null, composerStartRestartGroup, (i2 & 14) | 48 | (i2 & 3670016), 512);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 2:
                    walletAutoReclaimStatus2 = walletAutoReclaimStatus;
                    composerStartRestartGroup.startReplaceGroup(-1598689810);
                    IconType iconType2 = IconType.IC_CHALO_PAY_WALLET;
                    String strC5 = StringResourcesHelperKt.c(StringEnum.GET_STARTED_WITH_CHALO_PAY, new Object[0], composerStartRestartGroup, 6);
                    String strC6 = StringResourcesHelperKt.c(StringEnum.VERIFY_YOUR_NUMBER, new Object[0], composerStartRestartGroup, 6);
                    String strC7 = StringResourcesHelperKt.c(StringEnum.ENABLE_NOW, new Object[0], composerStartRestartGroup, 6);
                    String strC8 = StringResourcesHelperKt.c(StringEnum.DO_IT_LATER, new Object[0], composerStartRestartGroup, 6);
                    int i4 = i2 & 57344;
                    boolean z4 = i4 == 16384;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new bm1(function1, 26);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function2 = (Function0) objRememberedValue3;
                    boolean z5 = i4 == 16384;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new bm1(function1, 27);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    f(z, iconType2, strC5, strC6, strC7, function2, modifier, strC8, (Function0) objRememberedValue4, null, composerStartRestartGroup, (i2 & 14) | 48 | (i2 & 3670016), 512);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 3:
                    walletAutoReclaimStatus2 = walletAutoReclaimStatus;
                    composerStartRestartGroup.startReplaceGroup(-1597891250);
                    IconType iconType3 = IconType.CHALO_PAY_BLOCKED;
                    String strC9 = StringResourcesHelperKt.c(StringEnum.CHALO_PAY_BLOCKED_ERROR_TITLE, new Object[0], composerStartRestartGroup, 6);
                    String strC10 = StringResourcesHelperKt.c(StringEnum.CHALO_PAY_BLOCKED_ERROR_MESSAGE, new Object[0], composerStartRestartGroup, 6);
                    String upperCase3 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.h(upperCase3, "toUpperCase(...)");
                    boolean z6 = (i2 & 57344) == 16384;
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (z6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new bm1(function1, 28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    f(z, iconType3, strC9, strC10, upperCase3, (Function0) objRememberedValue5, modifier, null, null, null, composerStartRestartGroup, (i2 & 14) | 48 | (i2 & 3670016), 896);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 4:
                    walletAutoReclaimStatus2 = walletAutoReclaimStatus;
                    composerStartRestartGroup.startReplaceGroup(-1597264647);
                    a(z, walletAutoReclaimStatus2, function1, composerStartRestartGroup, (i2 & 14) | ((i2 >> 12) & 112) | ((i2 >> 6) & 896));
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 5:
                    walletAutoReclaimStatus2 = walletAutoReclaimStatus;
                    composerStartRestartGroup.startReplaceGroup(-1596954709);
                    String strC11 = null;
                    if (str == null) {
                        composerStartRestartGroup.startReplaceGroup(-1596916549);
                        composerStartRestartGroup.endReplaceGroup();
                        strC = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1596916548);
                        strC = StringResourcesHelperKt.c(StringEnum.AT_TIME, new Object[]{str}, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (strC == null) {
                        composerStartRestartGroup.startReplaceGroup(-1021339405);
                        strC = StringResourcesHelperKt.c(StringEnum.IN_SOME_TIME, new Object[0], composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1021345512);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (str2 == null) {
                        composerStartRestartGroup.startReplaceGroup(-1596610889);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1596610888);
                        strC11 = StringResourcesHelperKt.c(StringEnum.AT_TIME, new Object[]{str2}, composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (strC11 == null) {
                        composerStartRestartGroup.startReplaceGroup(-1021329421);
                        strC11 = StringResourcesHelperKt.c(StringEnum.IN_SOME_TIME, new Object[0], composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1021335776);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    String str3 = strC;
                    IconType iconType4 = IconType.CHALO_PAY_NOT_ACTIVATE;
                    String strC12 = StringResourcesHelperKt.c(StringEnum.WALLET_APP_RECLAIM_ERROR_TITLE, new Object[]{str3}, composerStartRestartGroup, 6);
                    String strC13 = StringResourcesHelperKt.c(StringEnum.WALLET_APP_RECLAIM_ERROR_MESSAGE, new Object[]{strC11}, composerStartRestartGroup, 6);
                    String upperCase4 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.h(upperCase4, "toUpperCase(...)");
                    boolean z7 = (i2 & 57344) == 16384;
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (z7 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new bm1(function1, 29);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    f(z, iconType4, strC12, strC13, upperCase4, (Function0) objRememberedValue6, modifier, null, null, null, composerStartRestartGroup, (i2 & 14) | 48 | (i2 & 3670016), 896);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 6:
                    walletAutoReclaimStatus2 = walletAutoReclaimStatus;
                    composerStartRestartGroup.startReplaceGroup(-1595527066);
                    IconType iconType5 = IconType.NO_INTERNET_ERROR;
                    String strC14 = StringResourcesHelperKt.c(StringEnum.WALLET_INTERNET_CONNECTION_ERROR_TITLE, new Object[0], composerStartRestartGroup, 6);
                    String strC15 = StringResourcesHelperKt.c(StringEnum.WALLET_INTERNET_CONNECTION_ERROR_COPY, new Object[0], composerStartRestartGroup, 6);
                    String strC16 = StringResourcesHelperKt.c(StringEnum.RETRY, new Object[0], composerStartRestartGroup, 6);
                    Locale locale2 = Locale.ROOT;
                    String upperCase5 = strC16.toUpperCase(locale2);
                    Intrinsics.h(upperCase5, "toUpperCase(...)");
                    String upperCase6 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6).toUpperCase(locale2);
                    Intrinsics.h(upperCase6, "toUpperCase(...)");
                    int i5 = i2 & 57344;
                    boolean z8 = i5 == 16384;
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (z8 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new xo1(function1, 0);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    Function0 function3 = (Function0) objRememberedValue7;
                    boolean z9 = i5 == 16384;
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (z9 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new xo1(function1, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    f(z, iconType5, strC14, strC15, upperCase5, function3, modifier, upperCase6, (Function0) objRememberedValue8, null, composerStartRestartGroup, (i2 & 14) | 48 | (i2 & 3670016), 512);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 7:
                    walletAutoReclaimStatus2 = walletAutoReclaimStatus;
                    composerStartRestartGroup.startReplaceGroup(-1594669079);
                    IconType iconType6 = IconType.WALLET_NOT_ACTIVATED;
                    String strC17 = StringResourcesHelperKt.c(StringEnum.FULL_KYC_NEEDED_ERROR_TITLE, new Object[0], composerStartRestartGroup, 6);
                    String strC18 = StringResourcesHelperKt.c(StringEnum.FULL_KYC_NEEDED_ERROR_MESSAGE, new Object[0], composerStartRestartGroup, 6);
                    String strC19 = StringResourcesHelperKt.c(StringEnum.VIEW_DETAILS, new Object[0], composerStartRestartGroup, 6);
                    String strC20 = StringResourcesHelperKt.c(StringEnum.LATER, new Object[0], composerStartRestartGroup, 6);
                    int i6 = i2 & 57344;
                    boolean z10 = i6 == 16384;
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (z10 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new xo1(function1, 2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    Function0 function4 = (Function0) objRememberedValue9;
                    boolean z11 = i6 == 16384;
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (z11 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new xo1(function1, 3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    f(z, iconType6, strC17, strC18, strC19, function4, modifier, strC20, (Function0) objRememberedValue10, null, composerStartRestartGroup, (i2 & 14) | 48 | (i2 & 3670016), 512);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 8:
                    walletAutoReclaimStatus2 = walletAutoReclaimStatus;
                    composerStartRestartGroup.startReplaceGroup(-1593836822);
                    IconType iconType7 = IconType.NO_INTERNET_ERROR;
                    String strC21 = StringResourcesHelperKt.c(StringEnum.CHALO_TIME_UNAVAILABLE_ERROR_TITLE, new Object[0], composerStartRestartGroup, 6);
                    String strC22 = StringResourcesHelperKt.c(StringEnum.CHALO_TIME_UNAVAILABLE_ERROR_MESSAGE, new Object[0], composerStartRestartGroup, 6);
                    String strC23 = StringResourcesHelperKt.c(StringEnum.RETRY, new Object[0], composerStartRestartGroup, 6);
                    Locale locale3 = Locale.ROOT;
                    String upperCase7 = strC23.toUpperCase(locale3);
                    Intrinsics.h(upperCase7, "toUpperCase(...)");
                    String upperCase8 = StringResourcesHelperKt.c(StringEnum.LATER, new Object[0], composerStartRestartGroup, 6).toUpperCase(locale3);
                    Intrinsics.h(upperCase8, "toUpperCase(...)");
                    int i7 = i2 & 57344;
                    boolean z12 = i7 == 16384;
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (z12 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new xo1(function1, 10);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    Function0 function5 = (Function0) objRememberedValue11;
                    boolean z13 = i7 == 16384;
                    Object objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (z13 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new xo1(function1, 11);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    f(z, iconType7, strC21, strC22, upperCase7, function5, modifier, upperCase8, (Function0) objRememberedValue12, null, composerStartRestartGroup, (i2 & 14) | 48 | (i2 & 3670016), 512);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 9:
                    walletAutoReclaimStatus2 = walletAutoReclaimStatus;
                    composerStartRestartGroup.startReplaceGroup(-1592980881);
                    IconType iconType8 = IconType.CHALO_PAY_ACTIVE;
                    String strC24 = StringResourcesHelperKt.c(StringEnum.WALLET_ACTIVE_TITLE, new Object[0], composerStartRestartGroup, 6);
                    String strC25 = StringResourcesHelperKt.c(StringEnum.WALLET_ACTIVE_MESSAGE, new Object[0], composerStartRestartGroup, 6);
                    String strC26 = StringResourcesHelperKt.c(StringEnum.ADD_MONEY, new Object[0], composerStartRestartGroup, 6);
                    Locale locale4 = Locale.ROOT;
                    String upperCase9 = strC26.toUpperCase(locale4);
                    Intrinsics.h(upperCase9, "toUpperCase(...)");
                    String upperCase10 = StringResourcesHelperKt.c(StringEnum.LATER, new Object[0], composerStartRestartGroup, 6).toUpperCase(locale4);
                    Intrinsics.h(upperCase10, "toUpperCase(...)");
                    int i8 = i2 & 57344;
                    boolean z14 = i8 == 16384;
                    Object objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (z14 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new xo1(function1, 12);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    Function0 function6 = (Function0) objRememberedValue13;
                    boolean z15 = i8 == 16384;
                    Object objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                    if (z15 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue14 = new bm1(function1, 22);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                    }
                    f(z, iconType8, strC24, strC25, upperCase9, function6, modifier, upperCase10, (Function0) objRememberedValue14, null, composerStartRestartGroup, (i2 & 14) | 48 | (i2 & 3670016), 512);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 10:
                    composerStartRestartGroup.startReplaceGroup(-1592158327);
                    IconType iconType9 = IconType.CHALO_PAY_ACTIVE;
                    String strC27 = StringResourcesHelperKt.c(StringEnum.CHALO_PAY_ACTIVE_TITLE, new Object[0], composerStartRestartGroup, 6);
                    String strC28 = StringResourcesHelperKt.c(StringEnum.CHALO_PAY_ACTIVE_MESSAGE, new Object[0], composerStartRestartGroup, 6);
                    String strC29 = StringResourcesHelperKt.c(StringEnum.ADD_MONEY, new Object[0], composerStartRestartGroup, 6);
                    Locale locale5 = Locale.ROOT;
                    String upperCase11 = strC29.toUpperCase(locale5);
                    Intrinsics.h(upperCase11, "toUpperCase(...)");
                    String upperCase12 = StringResourcesHelperKt.c(StringEnum.LATER, new Object[0], composerStartRestartGroup, 6).toUpperCase(locale5);
                    Intrinsics.h(upperCase12, "toUpperCase(...)");
                    int i9 = i2 & 57344;
                    boolean z16 = i9 == 16384;
                    Object objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                    if (z16 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue15 = new bm1(function1, 23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                    }
                    Function0 function7 = (Function0) objRememberedValue15;
                    boolean z17 = i9 == 16384;
                    Object objRememberedValue16 = composerStartRestartGroup.rememberedValue();
                    if (z17 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue16 = new bm1(function1, 24);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue16);
                    }
                    walletAutoReclaimStatus2 = walletAutoReclaimStatus;
                    f(z, iconType9, strC27, strC28, upperCase11, function7, modifier2, upperCase12, (Function0) objRememberedValue16, null, composerStartRestartGroup, (i2 & 14) | 48 | (i2 & 3670016), 512);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                default:
                    throw pk0.p(composerStartRestartGroup, -1021424313);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            walletAutoReclaimStatus2 = walletAutoReclaimStatus;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ja(z, walletAccessSheet, str, str2, function1, walletAutoReclaimStatus2, modifier, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0134  */
    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x013b  */
    /* JADX WARN: Code duplicated, block: B:104:0x013d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0145  */
    /* JADX WARN: Code duplicated, block: B:111:0x0176  */
    /* JADX WARN: Code duplicated, block: B:114:0x0182  */
    /* JADX WARN: Code duplicated, block: B:115:0x0186  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x020b  */
    /* JADX WARN: Code duplicated, block: B:123:0x020f  */
    /* JADX WARN: Code duplicated, block: B:126:0x022b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0249  */
    /* JADX WARN: Code duplicated, block: B:131:0x0346  */
    /* JADX WARN: Code duplicated, block: B:133:0x0369  */
    /* JADX WARN: Code duplicated, block: B:136:0x03a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:142:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:143:0x040a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0431  */
    /* JADX WARN: Code duplicated, block: B:146:0x0433  */
    /* JADX WARN: Code duplicated, block: B:149:0x043a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0442  */
    /* JADX WARN: Code duplicated, block: B:155:0x047c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0485  */
    /* JADX WARN: Code duplicated, block: B:160:0x0496  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x0106  */
    /* JADX WARN: Code duplicated, block: B:85:0x0109  */
    /* JADX WARN: Code duplicated, block: B:89:0x011a  */
    /* JADX WARN: Code duplicated, block: B:90:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0127  */
    /* JADX WARN: Code duplicated, block: B:95:0x012a  */
    /* JADX WARN: Code duplicated, block: B:97:0x012d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0130  */
    public static final void f(boolean z, IconType iconType, String titleCopy, String messageCopy, String positiveCopy, Function0 positiveOnClick, Modifier modifier, String str, Function0 function0, Function0 function1, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        Composer composer2;
        Function0 function2;
        Function0 function3;
        Modifier modifier3;
        String str3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier4;
        String str4;
        Function0 function4;
        Function0 function5;
        Function0<ComposeUiNode> constructor;
        Modifier.Companion companion;
        Function0<ComposeUiNode> constructor2;
        ColumnScopeInstance columnScopeInstance;
        int i10;
        int i11;
        Function0 function6;
        int i12;
        Composer composer3;
        Modifier.Companion companion2;
        Modifier.Companion companion3;
        String str5;
        Function0 function7;
        boolean z3;
        boolean z4;
        Object objRememberedValue;
        Intrinsics.i(iconType, "iconType");
        Intrinsics.i(titleCopy, "titleCopy");
        Intrinsics.i(messageCopy, "messageCopy");
        Intrinsics.i(positiveCopy, "positiveCopy");
        Intrinsics.i(positiveOnClick, "positiveOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2026138347);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(iconType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(titleCopy) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(messageCopy) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(positiveCopy) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(positiveOnClick) ? 131072 : 65536;
        }
        int i13 = i2 & 64;
        if (i13 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    str2 = str;
                    if (composerStartRestartGroup.changed(str2)) {
                        i5 = 8388608;
                    } else {
                        i5 = 4194304;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 256;
                if (i6 != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i7 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i7 = 33554432;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 512;
                if (i8 != 0) {
                    i3 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i9 = 536870912;
                    } else {
                        i9 = 268435456;
                    }
                    i3 |= i9;
                }
                if ((i3 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                    if (i13 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i4 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    } else {
                        function4 = function0;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    } else {
                        function5 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2026138347, i3, -1, "app.chalo.wallet.ui.access.WalletCommonBottomSheet (WalletAccessBaseScreen.kt:429)");
                    }
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i14 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    constructor = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion5, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl, Integer.valueOf(i14), composerM3915constructorimpl));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    companion = Modifier.INSTANCE;
                    Modifier modifier5 = modifier4;
                    Modifier modifierM787paddingqDBjuR0 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion4.getCenterHorizontally(), composerStartRestartGroup, 54);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i15 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR0);
                    constructor2 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion5, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl2, Integer.valueOf(i15), composerM3915constructorimpl2));
                    columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(799208142);
                        i10 = 0;
                        SpacerKt.Spacer(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                    } else {
                        i10 = 0;
                        composerStartRestartGroup.startReplaceGroup(781346345);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM828size3ABfNKs = SizeKt.m828size3ABfNKs(r23, ChaloTheme.b(composerStartRestartGroup, i10).b0);
                    int i16 = i3 >> 3;
                    Painter painterA = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, i16 & 14);
                    i11 = Painter.$stable | 48;
                    function6 = function5;
                    i12 = i3;
                    ImageKt.Image(painterA, (String) null, modifierM828size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i11, 120);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(r23, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(r23, 0.0f, 1, null);
                    TextAlign.Companion companion6 = TextAlign.INSTANCE;
                    TextKt.m2623TextNvy7gAk(titleCopy, modifierFillMaxWidth$default, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, TextAlign.m7161boximpl(companion6.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall(), composerStartRestartGroup, ((i12 >> 6) & 14) | 1572912, 0, 129976);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    int iM7168getCentere0LSkKk = companion6.m7168getCentere0LSkKk();
                    int i17 = i12 >> 9;
                    TextKt.m2623TextNvy7gAk(messageCopy, modifierFillMaxWidth$default2, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(iM7168getCentere0LSkKk), 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i17 & 14) | 48, 0, 130040);
                    composer3 = composerStartRestartGroup;
                    if (z) {
                        composer3.startReplaceGroup(800306286);
                        companion2 = companion;
                        SpacerKt.Spacer(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        companion2 = companion;
                        composer3.startReplaceGroup(800371820);
                        gf.r(companion2, ChaloTheme.b(composer3, 0).i, composer3, 0);
                    }
                    companion3 = companion2;
                    ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), positiveCopy, null, 0L, null, false, 0.0f, null, 0L, positiveOnClick, composer3, (i17 & 112) | 6 | ((i12 << 12) & 1879048192), TypedValues.PositionType.TYPE_CURVE_FIT);
                    if (str4 != null || function4 == null) {
                        str5 = str4;
                        function7 = function4;
                        z3 = true;
                        composer3.startReplaceGroup(781346345);
                    } else {
                        composer3.startReplaceGroup(800719175);
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composer3, 0).h), composer3, 0);
                        z3 = true;
                        String str6 = str4;
                        Function0 function8 = function4;
                        ChaloFilledButtonKt.f(str6, false, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), null, null, ChaloTheme.b(composer3, 0).n, 0L, function8, composer3, ((i12 >> 21) & 14) | 384 | (i16 & 29360128), 90);
                        str5 = str6;
                        function7 = function8;
                        composer3 = composer3;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (function6 == null) {
                        composer3.startReplaceGroup(106697285);
                        composer3.endReplaceGroup();
                        composer2 = composer3;
                    } else {
                        composer3.startReplaceGroup(106697286);
                        Painter painterA2 = PainterResourceHelperKt.a(IconType.IC_ARROW_BACK_BLACK, composer3, 6);
                        Modifier modifierM828size3ABfNKs2 = SizeKt.m828size3ABfNKs(PaddingKt.m784padding3ABfNKs(companion3, ChaloTheme.b(composer3, 0).h), ChaloTheme.b(composer3, 0).i);
                        if ((i12 & 1879048192) == 536870912) {
                            z4 = z3;
                        } else {
                            z4 = false;
                        }
                        objRememberedValue = composer3.rememberedValue();
                        if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ag1(function6, 19);
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer2 = composer3;
                        ImageKt.Image(painterA2, (String) null, ClickableKt.m299clickableoSLSa3U$default(modifierM828size3ABfNKs2, false, null, null, null, (Function0) objRememberedValue, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, i11, 120);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function7;
                    function3 = function6;
                    modifier3 = modifier5;
                    str3 = str5;
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.skipToGroupEnd();
                    function2 = function0;
                    function3 = function1;
                    modifier3 = modifier2;
                    str3 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new qo(z, iconType, titleCopy, messageCopy, positiveCopy, positiveOnClick, modifier3, str3, function2, function3, i, i2));
                }
            }
            i3 |= 12582912;
            str2 = str;
            i6 = i2 & 256;
            if (i6 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i7 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            i8 = i2 & 512;
            if (i8 != 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            if ((i3 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                if (i13 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function0;
                }
                if (i8 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2026138347, i3, -1, "app.chalo.wallet.ui.access.WalletCommonBottomSheet (WalletAccessBaseScreen.kt:429)");
                }
                Alignment.Companion companion7 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i18 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                constructor = companion8.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion8, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
                Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl3, Integer.valueOf(i18), composerM3915constructorimpl3));
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                companion = Modifier.INSTANCE;
                Modifier modifier6 = modifier4;
                Modifier modifierM787paddingqDBjuR1 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion7.getCenterHorizontally(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i19 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR1);
                constructor2 = companion8.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion8, composerM3915constructorimpl4, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion8, composerM3915constructorimpl4, Integer.valueOf(i19), composerM3915constructorimpl4));
                columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(799208142);
                    i10 = 0;
                    SpacerKt.Spacer(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                } else {
                    i10 = 0;
                    composerStartRestartGroup.startReplaceGroup(781346345);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM828size3ABfNKs3 = SizeKt.m828size3ABfNKs(r23, ChaloTheme.b(composerStartRestartGroup, i10).b0);
                int i110 = i3 >> 3;
                Painter painterA3 = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, i110 & 14);
                i11 = Painter.$stable | 48;
                function6 = function5;
                i12 = i3;
                ImageKt.Image(painterA3, (String) null, modifierM828size3ABfNKs3, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i11, 120);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(r23, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(r23, 0.0f, 1, null);
                TextAlign.Companion companion9 = TextAlign.INSTANCE;
                TextKt.m2623TextNvy7gAk(titleCopy, modifierFillMaxWidth$default3, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, TextAlign.m7161boximpl(companion9.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall(), composerStartRestartGroup, ((i12 >> 6) & 14) | 1572912, 0, 129976);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                int iM7168getCentere0LSkKk2 = companion9.m7168getCentere0LSkKk();
                int i111 = i12 >> 9;
                TextKt.m2623TextNvy7gAk(messageCopy, modifierFillMaxWidth$default4, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(iM7168getCentere0LSkKk2), 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i111 & 14) | 48, 0, 130040);
                composer3 = composerStartRestartGroup;
                if (z) {
                    composer3.startReplaceGroup(800306286);
                    companion2 = companion;
                    SpacerKt.Spacer(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composer3, 0);
                    composer3.endReplaceGroup();
                } else {
                    companion2 = companion;
                    composer3.startReplaceGroup(800371820);
                    gf.r(companion2, ChaloTheme.b(composer3, 0).i, composer3, 0);
                }
                companion3 = companion2;
                ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), positiveCopy, null, 0L, null, false, 0.0f, null, 0L, positiveOnClick, composer3, (i111 & 112) | 6 | ((i12 << 12) & 1879048192), TypedValues.PositionType.TYPE_CURVE_FIT);
                if (str4 != null) {
                    str5 = str4;
                    function7 = function4;
                    z3 = true;
                    composer3.startReplaceGroup(781346345);
                } else {
                    str5 = str4;
                    function7 = function4;
                    z3 = true;
                    composer3.startReplaceGroup(781346345);
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                if (function6 == null) {
                    composer3.startReplaceGroup(106697285);
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                } else {
                    composer3.startReplaceGroup(106697286);
                    Painter painterA4 = PainterResourceHelperKt.a(IconType.IC_ARROW_BACK_BLACK, composer3, 6);
                    Modifier modifierM828size3ABfNKs4 = SizeKt.m828size3ABfNKs(PaddingKt.m784padding3ABfNKs(companion3, ChaloTheme.b(composer3, 0).h), ChaloTheme.b(composer3, 0).i);
                    if ((i12 & 1879048192) == 536870912) {
                        z4 = z3;
                    } else {
                        z4 = false;
                    }
                    objRememberedValue = composer3.rememberedValue();
                    if (z4) {
                        objRememberedValue = new ag1(function6, 19);
                        composer3.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new ag1(function6, 19);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer2 = composer3;
                    ImageKt.Image(painterA4, (String) null, ClickableKt.m299clickableoSLSa3U$default(modifierM828size3ABfNKs4, false, null, null, null, (Function0) objRememberedValue, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, i11, 120);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function7;
                function3 = function6;
                modifier3 = modifier6;
                str3 = str5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function2 = function0;
                function3 = function1;
                modifier3 = modifier2;
                str3 = str2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new qo(z, iconType, titleCopy, messageCopy, positiveCopy, positiveOnClick, modifier3, str3, function2, function3, i, i2));
            }
        }
        i3 |= 1572864;
        modifier2 = modifier;
        i4 = i2 & 128;
        if (i4 != 0) {
            if ((12582912 & i) == 0) {
                str2 = str;
                if (composerStartRestartGroup.changed(str2)) {
                    i5 = 8388608;
                } else {
                    i5 = 4194304;
                }
                i3 |= i5;
            }
            i6 = i2 & 256;
            if (i6 != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i7 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i7 = 33554432;
                }
                i3 |= i7;
            }
            i8 = i2 & 512;
            if (i8 != 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i9 = 536870912;
                } else {
                    i9 = 268435456;
                }
                i3 |= i9;
            }
            if ((i3 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
                if (i13 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i4 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i6 != 0) {
                    function4 = null;
                } else {
                    function4 = function0;
                }
                if (i8 != 0) {
                    function5 = null;
                } else {
                    function5 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2026138347, i3, -1, "app.chalo.wallet.ui.access.WalletCommonBottomSheet (WalletAccessBaseScreen.kt:429)");
                }
                Alignment.Companion companion10 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion10.getTopStart(), false);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i112 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                constructor = companion11.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion11, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl5, Integer.valueOf(i112), composerM3915constructorimpl5));
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                companion = Modifier.INSTANCE;
                Modifier modifier7 = modifier4;
                Modifier modifierM787paddingqDBjuR2 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion10.getCenterHorizontally(), composerStartRestartGroup, 54);
                long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i113 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> 32));
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR2);
                constructor2 = companion11.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion11, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl6, currentCompositionLocalMap6);
                Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion11, composerM3915constructorimpl6, Integer.valueOf(i113), composerM3915constructorimpl6));
                columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(799208142);
                    i10 = 0;
                    SpacerKt.Spacer(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                } else {
                    i10 = 0;
                    composerStartRestartGroup.startReplaceGroup(781346345);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM828size3ABfNKs5 = SizeKt.m828size3ABfNKs(r23, ChaloTheme.b(composerStartRestartGroup, i10).b0);
                int i114 = i3 >> 3;
                Painter painterA5 = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, i114 & 14);
                i11 = Painter.$stable | 48;
                function6 = function5;
                i12 = i3;
                ImageKt.Image(painterA5, (String) null, modifierM828size3ABfNKs5, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i11, 120);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(r23, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(r23, 0.0f, 1, null);
                TextAlign.Companion companion12 = TextAlign.INSTANCE;
                TextKt.m2623TextNvy7gAk(titleCopy, modifierFillMaxWidth$default5, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, TextAlign.m7161boximpl(companion12.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall(), composerStartRestartGroup, ((i12 >> 6) & 14) | 1572912, 0, 129976);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                int iM7168getCentere0LSkKk3 = companion12.m7168getCentere0LSkKk();
                int i115 = i12 >> 9;
                TextKt.m2623TextNvy7gAk(messageCopy, modifierFillMaxWidth$default6, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(iM7168getCentere0LSkKk3), 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i115 & 14) | 48, 0, 130040);
                composer3 = composerStartRestartGroup;
                if (z) {
                    composer3.startReplaceGroup(800306286);
                    companion2 = companion;
                    SpacerKt.Spacer(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composer3, 0);
                    composer3.endReplaceGroup();
                } else {
                    companion2 = companion;
                    composer3.startReplaceGroup(800371820);
                    gf.r(companion2, ChaloTheme.b(composer3, 0).i, composer3, 0);
                }
                companion3 = companion2;
                ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), positiveCopy, null, 0L, null, false, 0.0f, null, 0L, positiveOnClick, composer3, (i115 & 112) | 6 | ((i12 << 12) & 1879048192), TypedValues.PositionType.TYPE_CURVE_FIT);
                if (str4 != null) {
                    str5 = str4;
                    function7 = function4;
                    z3 = true;
                    composer3.startReplaceGroup(781346345);
                } else {
                    str5 = str4;
                    function7 = function4;
                    z3 = true;
                    composer3.startReplaceGroup(781346345);
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                if (function6 == null) {
                    composer3.startReplaceGroup(106697285);
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                } else {
                    composer3.startReplaceGroup(106697286);
                    Painter painterA6 = PainterResourceHelperKt.a(IconType.IC_ARROW_BACK_BLACK, composer3, 6);
                    Modifier modifierM828size3ABfNKs6 = SizeKt.m828size3ABfNKs(PaddingKt.m784padding3ABfNKs(companion3, ChaloTheme.b(composer3, 0).h), ChaloTheme.b(composer3, 0).i);
                    if ((i12 & 1879048192) == 536870912) {
                        z4 = z3;
                    } else {
                        z4 = false;
                    }
                    objRememberedValue = composer3.rememberedValue();
                    if (z4) {
                        objRememberedValue = new ag1(function6, 19);
                        composer3.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new ag1(function6, 19);
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer2 = composer3;
                    ImageKt.Image(painterA6, (String) null, ClickableKt.m299clickableoSLSa3U$default(modifierM828size3ABfNKs6, false, null, null, null, (Function0) objRememberedValue, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, i11, 120);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function7;
                function3 = function6;
                modifier3 = modifier7;
                str3 = str5;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                function2 = function0;
                function3 = function1;
                modifier3 = modifier2;
                str3 = str2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new qo(z, iconType, titleCopy, messageCopy, positiveCopy, positiveOnClick, modifier3, str3, function2, function3, i, i2));
            }
        }
        i3 |= 12582912;
        str2 = str;
        i6 = i2 & 256;
        if (i6 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i7 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        i8 = i2 & 512;
        if (i8 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i3 |= i9;
        }
        if ((i3 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (composerStartRestartGroup.shouldExecute(z2, i3 & 1)) {
            if (i13 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i4 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i6 != 0) {
                function4 = null;
            } else {
                function4 = function0;
            }
            if (i8 != 0) {
                function5 = null;
            } else {
                function5 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2026138347, i3, -1, "app.chalo.wallet.ui.access.WalletCommonBottomSheet (WalletAccessBaseScreen.kt:429)");
            }
            Alignment.Companion companion13 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion13.getTopStart(), false);
            long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i116 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
            constructor = companion14.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion14, composerM3915constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3915constructorimpl7, currentCompositionLocalMap7);
            Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion14, composerM3915constructorimpl7, Integer.valueOf(i116), composerM3915constructorimpl7));
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            companion = Modifier.INSTANCE;
            Modifier modifier8 = modifier4;
            Modifier modifierM787paddingqDBjuR3 = PaddingKt.m787paddingqDBjuR0(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).i, ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion13.getCenterHorizontally(), composerStartRestartGroup, 54);
            long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i117 = (int) (currentCompositeKeyHashCode8 ^ (currentCompositeKeyHashCode8 >>> 32));
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM787paddingqDBjuR3);
            constructor2 = companion14.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion14, composerM3915constructorimpl8, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl8, currentCompositionLocalMap8);
            Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion14, composerM3915constructorimpl8, Integer.valueOf(i117), composerM3915constructorimpl8));
            columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(799208142);
                i10 = 0;
                SpacerKt.Spacer(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            } else {
                i10 = 0;
                composerStartRestartGroup.startReplaceGroup(781346345);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM828size3ABfNKs7 = SizeKt.m828size3ABfNKs(r23, ChaloTheme.b(composerStartRestartGroup, i10).b0);
            int i118 = i3 >> 3;
            Painter painterA7 = PainterResourceHelperKt.a(iconType, composerStartRestartGroup, i118 & 14);
            i11 = Painter.$stable | 48;
            function6 = function5;
            i12 = i3;
            ImageKt.Image(painterA7, (String) null, modifierM828size3ABfNKs7, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, i11, 120);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(r23, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(r23, 0.0f, 1, null);
            TextAlign.Companion companion15 = TextAlign.INSTANCE;
            TextKt.m2623TextNvy7gAk(titleCopy, modifierFillMaxWidth$default7, ChaloTheme.a(composerStartRestartGroup, 0).t0, null, 0L, null, FontWeight.INSTANCE.getBold(), null, 0L, null, TextAlign.m7161boximpl(companion15.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTheme.e(composerStartRestartGroup, 0).getDisplaySmall(), composerStartRestartGroup, ((i12 >> 6) & 14) | 1572912, 0, 129976);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default8 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            int iM7168getCentere0LSkKk4 = companion15.m7168getCentere0LSkKk();
            int i119 = i12 >> 9;
            TextKt.m2623TextNvy7gAk(messageCopy, modifierFillMaxWidth$default8, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(iM7168getCentere0LSkKk4), 0L, 0, false, 0, 0, null, ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, (i119 & 14) | 48, 0, 130040);
            composer3 = composerStartRestartGroup;
            if (z) {
                composer3.startReplaceGroup(800306286);
                companion2 = companion;
                SpacerKt.Spacer(dq.a(columnScopeInstance, companion, 1.0f, false, 2, null), composer3, 0);
                composer3.endReplaceGroup();
            } else {
                companion2 = companion;
                composer3.startReplaceGroup(800371820);
                gf.r(companion2, ChaloTheme.b(composer3, 0).i, composer3, 0);
            }
            companion3 = companion2;
            ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), positiveCopy, null, 0L, null, false, 0.0f, null, 0L, positiveOnClick, composer3, (i119 & 112) | 6 | ((i12 << 12) & 1879048192), TypedValues.PositionType.TYPE_CURVE_FIT);
            if (str4 != null) {
                str5 = str4;
                function7 = function4;
                z3 = true;
                composer3.startReplaceGroup(781346345);
            } else {
                str5 = str4;
                function7 = function4;
                z3 = true;
                composer3.startReplaceGroup(781346345);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (function6 == null) {
                composer3.startReplaceGroup(106697285);
                composer3.endReplaceGroup();
                composer2 = composer3;
            } else {
                composer3.startReplaceGroup(106697286);
                Painter painterA8 = PainterResourceHelperKt.a(IconType.IC_ARROW_BACK_BLACK, composer3, 6);
                Modifier modifierM828size3ABfNKs8 = SizeKt.m828size3ABfNKs(PaddingKt.m784padding3ABfNKs(companion3, ChaloTheme.b(composer3, 0).h), ChaloTheme.b(composer3, 0).i);
                if ((i12 & 1879048192) == 536870912) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                objRememberedValue = composer3.rememberedValue();
                if (z4) {
                    objRememberedValue = new ag1(function6, 19);
                    composer3.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new ag1(function6, 19);
                    composer3.updateRememberedValue(objRememberedValue);
                }
                composer2 = composer3;
                ImageKt.Image(painterA8, (String) null, ClickableKt.m299clickableoSLSa3U$default(modifierM828size3ABfNKs8, false, null, null, null, (Function0) objRememberedValue, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, i11, 120);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function7;
            function3 = function6;
            modifier3 = modifier8;
            str3 = str5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            function2 = function0;
            function3 = function1;
            modifier3 = modifier2;
            str3 = str2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new qo(z, iconType, titleCopy, messageCopy, positiveCopy, positiveOnClick, modifier3, str3, function2, function3, i, i2));
        }
    }
}
