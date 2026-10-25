package app.chalo.home.ui.home;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SheetState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.HomeOverscrollEffect_androidKt;
import app.chalo.compose.PermissionsRationaleDialogKt;
import app.chalo.compose.components.ChaloGradientBackgroundKt;
import app.chalo.compose.components.ChaloGridLayoutKt;
import app.chalo.compose.components.ChaloRoundedBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.ChaloTabTitleKt;
import app.chalo.compose.insets.PlatformInsets_androidKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.home.ui.HomeTabScreensRetainedData;
import app.chalo.home.ui.common.PremiumBusUpcomingBottomSheetLayoutKt;
import app.chalo.home.ui.common.TabHeaderKt;
import app.chalo.home.ui.common.TitoRideDetailsBottomSheetLayoutKt;
import app.chalo.home.ui.home.HomeScreenViewIntent;
import app.chalo.home.ui.home.HomeTabScaffoldKt;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.homescreen.data.model.app.HomePageFeature;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.premiumbus.prebookedtickets.cancellationack.PremiumBusInAppCommunicationBottomSheetScreenKt;
import app.chalo.premiumbus.prebookedtickets.ui.cancellationack.PremiumBusInAppCommunicationBottomSheetData;
import app.chalo.premiumbus.prebookedtickets.ui.newactivation.ticketinfohandler.PremiumBusBookingCardData;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.titoridedetail.data.app.TitoRideDataAppModel;
import defpackage.cy;
import defpackage.f0;
import defpackage.gf;
import defpackage.ir;
import defpackage.m;
import defpackage.nu;
import defpackage.ob;
import defpackage.ph;
import defpackage.pk0;
import defpackage.q70;
import defpackage.u6;
import defpackage.v60;
import defpackage.xd;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003¨\u0006\u000b²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0004\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"", "lastSheetVisibility", "Landroidx/compose/ui/unit/Dp;", "heightInDp", "passesSectionHtInDp", "bannerAdLoaded", "Lapp/chalo/home/ui/home/HomeUnifiedAdUiState;", "adUiState", "", "adAlpha", "adScaleY", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HomeTabScaffoldKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3580a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[HomePageFeature.values().length];
            try {
                iArr[HomePageFeature.TICKETS_PASSES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomePageFeature.REGULAR_BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomePageFeature.CHALO_BUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HomePageFeature.CARD_RECHARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HomePageFeature.METRO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[HomePageFeature.PLOTLINE_WIDGET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[HomePageFeature.FOOTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[HomePageFeature.IMAGE_RESOURCE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[HomePageFeature.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f3580a = iArr;
            int[] iArr2 = new int[HomePageSectionDisplayType.values().length];
            try {
                iArr2[HomePageSectionDisplayType.IMAGE_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[HomePageSectionDisplayType.GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[HomePageSectionDisplayType.CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[HomePageSectionDisplayType.PLOTLINE_WIDGET.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[HomePageSectionDisplayType.GAM_BANNER_AD.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[HomePageSectionDisplayType.ADSTER_UNIFIED_AD.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[HomePageSectionDisplayType.FOOTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[HomePageSectionDisplayType.DIVIDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            b = iArr2;
        }
    }

    public static final void a(final Function1 function1, final PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData, Composer composer, int i) {
        int i2;
        int i3;
        String strC;
        int i4;
        String strC2;
        String strC3;
        IconType iconType;
        final int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-409358282);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(premiumBusInAppCommunicationBottomSheetData) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-409358282, i2, -1, "app.chalo.home.ui.home.ChaloPremiumBusInAppCommunicationBottomSheet (HomeTabScaffold.kt:216)");
            }
            String strC4 = StringResourcesHelperKt.c(StringEnum.SEE_DETAILS, new Object[0], composerStartRestartGroup, 6);
            String strC5 = StringResourcesHelperKt.c(StringEnum.OKAY, new Object[0], composerStartRestartGroup, 6);
            if (premiumBusInAppCommunicationBottomSheetData instanceof PremiumBusInAppCommunicationBottomSheetData.SystemCancellation) {
                composerStartRestartGroup.startReplaceGroup(-1779961522);
                iconType = IconType.IC_TRIP_CANCELLED_ACK;
                strC = StringResourcesHelperKt.c(StringEnum.TRIP_CANCELLED, new Object[0], composerStartRestartGroup, 6);
                PremiumBusInAppCommunicationBottomSheetData.SystemCancellation systemCancellation = (PremiumBusInAppCommunicationBottomSheetData.SystemCancellation) premiumBusInAppCommunicationBottomSheetData;
                i3 = 1;
                strC2 = StringResourcesHelperKt.c(StringEnum.TRIP_CANCELLED_ACK_MSG, new Object[]{systemCancellation.f, systemCancellation.e.g.b}, composerStartRestartGroup, 6);
                strC3 = StringResourcesHelperKt.c(StringEnum.BOOK_ANOTHER_TRIP, new Object[0], composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                i4 = 0;
            } else {
                i3 = 1;
                if (!(premiumBusInAppCommunicationBottomSheetData instanceof PremiumBusInAppCommunicationBottomSheetData.SystemReschedule)) {
                    throw pk0.p(composerStartRestartGroup, 1743694848);
                }
                composerStartRestartGroup.startReplaceGroup(-1779476403);
                IconType iconType2 = IconType.IC_SYSTEM_RESCHEDULED;
                strC = StringResourcesHelperKt.c(StringEnum.TRIP_RESCHEDULED, new Object[0], composerStartRestartGroup, 6);
                PremiumBusInAppCommunicationBottomSheetData.SystemReschedule systemReschedule = (PremiumBusInAppCommunicationBottomSheetData.SystemReschedule) premiumBusInAppCommunicationBottomSheetData;
                i4 = 0;
                strC2 = StringResourcesHelperKt.c(StringEnum.TRIP_RESCHEDULED_ACK_MSG, new Object[]{systemReschedule.f, systemReschedule.g, systemReschedule.h, systemReschedule.i}, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
                strC3 = strC4;
                iconType = iconType2;
            }
            String str = strC2;
            int i6 = i2 & 14;
            int i7 = i2 & 112;
            int i8 = (i6 == 4 ? i3 : i4) | (i7 == 32 ? i3 : i4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i8 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i5 = i4;
                objRememberedValue = new Function0() { // from class: f80
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                function1.invoke(new HomeScreenViewIntent.PremiumBusAckBottomSheetPositiveCtaClickedIntent(premiumBusInAppCommunicationBottomSheetData));
                                break;
                            default:
                                function1.invoke(new HomeScreenViewIntent.PremiumBusAckBottomSheetNegativeCtaClickedIntent(premiumBusInAppCommunicationBottomSheetData));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i5 = i4;
            }
            Function0 function0 = (Function0) objRememberedValue;
            int i9 = i6 == 4 ? i3 : i5;
            if (i7 == 32) {
                i5 = i3;
            }
            int i10 = i9 | i5;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                final int i11 = i3;
                objRememberedValue2 = new Function0() { // from class: f80
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                function1.invoke(new HomeScreenViewIntent.PremiumBusAckBottomSheetPositiveCtaClickedIntent(premiumBusInAppCommunicationBottomSheetData));
                                break;
                            default:
                                function1.invoke(new HomeScreenViewIntent.PremiumBusAckBottomSheetNegativeCtaClickedIntent(premiumBusInAppCommunicationBottomSheetData));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            PremiumBusInAppCommunicationBottomSheetScreenKt.a(0, composerStartRestartGroup, null, iconType, strC, str, strC3, strC5, function0, (Function0) objRememberedValue2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(function1, premiumBusInAppCommunicationBottomSheetData, i, 5));
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 34861. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void b(boolean r79, kotlin.jvm.functions.Function1 r80, java.util.List r81, androidx.compose.runtime.Composer r82, int r83) {
        /*
            Method dump skipped, instruction units count: 3486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.home.HomeTabScaffoldKt.b(boolean, kotlin.jvm.functions.Function1, java.util.List, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(HomeScreenDialogType homeScreenDialogType, Function1 function1, Composer composer, int i) {
        int i2;
        boolean z;
        Composer composerStartRestartGroup = composer.startRestartGroup(2075668559);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(homeScreenDialogType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2075668559, i2, -1, "app.chalo.home.ui.home.HomeScreenDialogHandler (HomeTabScaffold.kt:185)");
            }
            if (Intrinsics.d(homeScreenDialogType, HomeScreenDialogType.LocationPermissionRationale.f3553a)) {
                composerStartRestartGroup.startReplaceGroup(1598094621);
                String strC = StringResourcesHelperKt.c(StringEnum.LOCATION_PERMISSION_PROMPT, new Object[0], composerStartRestartGroup, 6);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new q70(function1, 14);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                z = i3 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new q70(function1, 15);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                PermissionsRationaleDialogKt.a(strC, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!Intrinsics.d(homeScreenDialogType, HomeScreenDialogType.JuspayPermissionRationale.f3552a)) {
                    throw pk0.p(composerStartRestartGroup, 1852664856);
                }
                composerStartRestartGroup.startReplaceGroup(1598619792);
                String strC2 = StringResourcesHelperKt.c(StringEnum.PHONE_SMS_PERMISSION_PROMPT, new Object[0], composerStartRestartGroup, 6);
                int i4 = i2 & 112;
                boolean z3 = i4 == 32;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new q70(function1, 16);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function2 = (Function0) objRememberedValue3;
                z = i4 == 32;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new q70(function1, 17);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                PermissionsRationaleDialogKt.a(strC2, function2, (Function0) objRememberedValue4, composerStartRestartGroup, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new v60(homeScreenDialogType, function1, i, 4));
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:179:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:182:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:189:0x040e  */
    /* JADX WARN: Code duplicated, block: B:190:0x041a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0429  */
    /* JADX WARN: Code duplicated, block: B:199:0x0438  */
    /* JADX WARN: Code duplicated, block: B:200:0x0444  */
    /* JADX WARN: Code duplicated, block: B:202:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:205:0x04af  */
    /* JADX WARN: Code duplicated, block: B:208:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:209:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:212:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:214:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:217:0x0557  */
    /* JADX WARN: Code duplicated, block: B:219:0x055a  */
    /* JADX WARN: Code duplicated, block: B:222:0x0566  */
    /* JADX WARN: Code duplicated, block: B:223:0x056a  */
    /* JADX WARN: Code duplicated, block: B:227:0x0595  */
    /* JADX WARN: Instruction removed from duplicated block: B:214:0x04f1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(final HomeScreenViewState homeScreenViewState, final Function1 function1, final boolean z, final int i, final float f, Composer composer, final int i2) {
        int i3;
        Object obj;
        MutableState mutableState;
        boolean z2;
        Function0 function0;
        Function0 function2;
        boolean z3;
        Object objRememberedValue;
        Function0 function3;
        List list;
        PremiumBusBookingCardData premiumBusBookingCardData;
        boolean z4;
        Function0<ComposeUiNode> constructor;
        boolean z5;
        Object obj2;
        Function0<ComposeUiNode> constructor2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1247088136);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(homeScreenViewState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1247088136, i3, -1, "app.chalo.home.ui.home.HomeTabContent (HomeTabScaffold.kt:269)");
            }
            HomeTabScreensRetainedData.HomeScreen homeScreen = homeScreenViewState.n;
            TabMetaDataAppModel tabMetaDataAppModel = homeScreenViewState.d;
            PremiumBusBookingCardData premiumBusBookingCardData2 = homeScreenViewState.g;
            TitoRideDataAppModel titoRideDataAppModel = homeScreenViewState.m;
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(homeScreen != null ? homeScreen.f3172a : 0, composerStartRestartGroup, 0, 0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = gf.b(0, null, 2, null, composerStartRestartGroup);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            HomeTabScreensRetainedData.HomeScreen homeScreen2 = homeScreenViewState.n;
            Integer numValueOf = Integer.valueOf(i);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 896;
            boolean zChangedInstance = (i4 == 256) | composerStartRestartGroup.changedInstance(homeScreenViewState) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
            int i5 = i3;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new HomeTabScaffoldKt$HomeTabContent$1$1(z, homeScreenViewState, scrollStateRememberScrollState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(homeScreen2, numValueOf, boolValueOf, (Function2) objRememberedValue3, composerStartRestartGroup, ((i5 >> 6) & 112) | i4);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean z6 = i4 == 256;
            int i6 = i5 & 112;
            boolean zChanged = (i6 == 32) | z6 | composerStartRestartGroup.changed(scrollStateRememberScrollState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                obj = null;
                objRememberedValue4 = new HomeTabScaffoldKt$HomeTabContent$2$1(z, function1, scrollStateRememberScrollState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                obj = null;
            }
            EffectsKt.LaunchedEffect(scrollStateRememberScrollState, boolValueOf2, (Function2) objRememberedValue4, composerStartRestartGroup, (i5 >> 3) & 112);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, obj);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), scrollStateRememberScrollState, HomeOverscrollEffect_androidKt.a(composerStartRestartGroup), false, null, false, 28, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            boolean zChanged2 = composerStartRestartGroup.changed(density);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                mutableState = mutableState2;
                objRememberedValue5 = new f0(density, mutableState, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                mutableState = mutableState2;
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM264backgroundbw27NRU$default, (Function1) objRememberedValue5);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            ChaloGradientBackgroundKt.a(boxScopeInstance, tabMetaDataAppModel.f3814a, ((Dp) mutableState.getValue()).m7292unboximpl(), null, composerStartRestartGroup, 6, 4);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion4, composerM3915constructorimpl3, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl3, Integer.valueOf(i9), composerM3915constructorimpl3));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            List list2 = homeScreenViewState.b;
            String str = homeScreenViewState.f;
            boolean z7 = homeScreenViewState.p;
            boolean z8 = !z7;
            ProfileDrawerCardData profileDrawerCardData = homeScreenViewState.f3577a;
            if (z7) {
                z2 = false;
            } else {
                LocationTooltipData locationTooltipData = homeScreenViewState.k;
                if (locationTooltipData != null ? locationTooltipData.f3584a : false) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            boolean z9 = i6 == 32;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new q70(function1, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            Function0 function4 = (Function0) objRememberedValue6;
            boolean z10 = i6 == 32;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new q70(function1, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            Function0 function5 = (Function0) objRememberedValue7;
            boolean z11 = i6 == 32;
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new q70(function1, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            Function0 function6 = (Function0) objRememberedValue8;
            boolean z12 = i6 == 32;
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new nu(function1, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Function1 function7 = (Function1) objRememberedValue9;
            boolean zChangedInstance2 = (i6 == 32) | composerStartRestartGroup.changedInstance(homeScreenViewState);
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new cy(15, function1, homeScreenViewState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            Function0 function8 = (Function0) objRememberedValue10;
            boolean z13 = i6 == 32;
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (z13) {
                function0 = function8;
            } else {
                function0 = function8;
                if (objRememberedValue11 == companion.getEmpty()) {
                }
                function2 = (Function0) objRememberedValue11;
                if (i6 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3) {
                    function3 = function2;
                } else {
                    function3 = function2;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    TabMetaDataAppModel.Companion companion5 = TabMetaDataAppModel.INSTANCE;
                    TabHeaderKt.f(null, tabMetaDataAppModel, function4, function5, function6, function7, function0, function3, str, z8, profileDrawerCardData, z2, null, null, null, null, null, list2, (Function2) objRememberedValue, composerStartRestartGroup, 64, 0, 126977);
                    composerStartRestartGroup = composerStartRestartGroup;
                    ChaloSpacersKt.o(composerStartRestartGroup, 0);
                    list = homeScreenViewState.c;
                    if (list == null) {
                        composerStartRestartGroup.startReplaceGroup(875507407);
                        composerStartRestartGroup.endReplaceGroup();
                        premiumBusBookingCardData = premiumBusBookingCardData2;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(875507408);
                        premiumBusBookingCardData = premiumBusBookingCardData2;
                        if (premiumBusBookingCardData == null || titoRideDataAppModel != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        b(z4, function1, list, composerStartRestartGroup, i6);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (titoRideDataAppModel == null) {
                        composerStartRestartGroup.startReplaceGroup(1126859072);
                        composerStartRestartGroup.endReplaceGroup();
                        obj2 = null;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1126859073);
                        Modifier modifierAlign = boxScopeInstance.align(ShadowKt.m4219shadows4CzXII$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, f, 7, null), ChaloTheme.c(composerStartRestartGroup, 0).f, ChaloTheme.d(composerStartRestartGroup, 0).e, true, 0L, 0L, 24, null), companion3.getBottomCenter());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i10 = (int) ((currentCompositeKeyHashCode4 >>> 32) ^ currentCompositeKeyHashCode4);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
                        constructor = companion4.getConstructor();
                        if (composerStartRestartGroup.getApplier() != null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
                        pk0.v(companion4, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM3915constructorimpl4, currentCompositionLocalMap4);
                        Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl4, Integer.valueOf(i10), composerM3915constructorimpl4));
                        ValidationProduct.Companion companion6 = ValidationProduct.INSTANCE;
                        obj2 = null;
                        TitoRideDetailsBottomSheetLayoutKt.a(titoRideDataAppModel, null, function1, composerStartRestartGroup, (i5 << 3) & 896);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (premiumBusBookingCardData == null) {
                        composerStartRestartGroup.startReplaceGroup(1127539336);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1127539337);
                        Modifier modifierAlign2 = boxScopeInstance.align(ShadowKt.m4219shadows4CzXII$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj2), 0.0f, 0.0f, 0.0f, f, 7, null), ChaloTheme.c(composerStartRestartGroup, 0).f, ChaloTheme.d(composerStartRestartGroup, 0).e, true, 0L, 0L, 24, null), companion3.getBottomCenter());
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                        long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                        int i11 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> 32));
                        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign2);
                        constructor2 = companion4.getConstructor();
                        if (!(composerStartRestartGroup.getApplier() != null)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor2);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composerStartRestartGroup);
                        pk0.v(companion4, composerM3915constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM3915constructorimpl5, currentCompositionLocalMap5);
                        Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl5, Integer.valueOf(i11), composerM3915constructorimpl5));
                        PremiumBusUpcomingBottomSheetLayoutKt.e(premiumBusBookingCardData, null, function1, composerStartRestartGroup, (i5 << 3) & 896);
                        composerStartRestartGroup.endNode();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                objRememberedValue = new xd(function1, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                TabMetaDataAppModel.Companion companion7 = TabMetaDataAppModel.INSTANCE;
                TabHeaderKt.f(null, tabMetaDataAppModel, function4, function5, function6, function7, function0, function3, str, z8, profileDrawerCardData, z2, null, null, null, null, null, list2, (Function2) objRememberedValue, composerStartRestartGroup, 64, 0, 126977);
                composerStartRestartGroup = composerStartRestartGroup;
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                list = homeScreenViewState.c;
                if (list == null) {
                    composerStartRestartGroup.startReplaceGroup(875507407);
                    composerStartRestartGroup.endReplaceGroup();
                    premiumBusBookingCardData = premiumBusBookingCardData2;
                } else {
                    composerStartRestartGroup.startReplaceGroup(875507408);
                    premiumBusBookingCardData = premiumBusBookingCardData2;
                    if (premiumBusBookingCardData == null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    b(z4, function1, list, composerStartRestartGroup, i6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (titoRideDataAppModel == null) {
                    composerStartRestartGroup.startReplaceGroup(1126859072);
                    composerStartRestartGroup.endReplaceGroup();
                    obj2 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1126859073);
                    Modifier modifierAlign3 = boxScopeInstance.align(ShadowKt.m4219shadows4CzXII$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, f, 7, null), ChaloTheme.c(composerStartRestartGroup, 0).f, ChaloTheme.d(composerStartRestartGroup, 0).e, true, 0L, 0L, 24, null), companion3.getBottomCenter());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i12 = (int) ((currentCompositeKeyHashCode6 >>> 32) ^ currentCompositeKeyHashCode6);
                    CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign3);
                    constructor = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion4, composerM3915constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM3915constructorimpl6, currentCompositionLocalMap6);
                    Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl6, Integer.valueOf(i12), composerM3915constructorimpl6));
                    ValidationProduct.Companion companion8 = ValidationProduct.INSTANCE;
                    obj2 = null;
                    TitoRideDetailsBottomSheetLayoutKt.a(titoRideDataAppModel, null, function1, composerStartRestartGroup, (i5 << 3) & 896);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (premiumBusBookingCardData == null) {
                    composerStartRestartGroup.startReplaceGroup(1127539336);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1127539337);
                    Modifier modifierAlign4 = boxScopeInstance.align(ShadowKt.m4219shadows4CzXII$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj2), 0.0f, 0.0f, 0.0f, f, 7, null), ChaloTheme.c(composerStartRestartGroup, 0).f, ChaloTheme.d(composerStartRestartGroup, 0).e, true, 0L, 0L, 24, null), companion3.getBottomCenter());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    long currentCompositeKeyHashCode7 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i13 = (int) (currentCompositeKeyHashCode7 ^ (currentCompositeKeyHashCode7 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign4);
                    constructor2 = companion4.getConstructor();
                    if (!(composerStartRestartGroup.getApplier() != null)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl7 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion4, composerM3915constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM3915constructorimpl7, currentCompositionLocalMap7);
                    Updater.m3923setimpl(composerM3915constructorimpl7, modifierMaterializeModifier7, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl7, Integer.valueOf(i13), composerM3915constructorimpl7));
                    PremiumBusUpcomingBottomSheetLayoutKt.e(premiumBusBookingCardData, null, function1, composerStartRestartGroup, (i5 << 3) & 896);
                    composerStartRestartGroup.endNode();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            objRememberedValue11 = new q70(function1, 13);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            function2 = (Function0) objRememberedValue11;
            if (i6 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3) {
                function3 = function2;
                if (objRememberedValue == companion.getEmpty()) {
                }
                TabMetaDataAppModel.Companion companion9 = TabMetaDataAppModel.INSTANCE;
                TabHeaderKt.f(null, tabMetaDataAppModel, function4, function5, function6, function7, function0, function3, str, z8, profileDrawerCardData, z2, null, null, null, null, null, list2, (Function2) objRememberedValue, composerStartRestartGroup, 64, 0, 126977);
                composerStartRestartGroup = composerStartRestartGroup;
                ChaloSpacersKt.o(composerStartRestartGroup, 0);
                list = homeScreenViewState.c;
                if (list == null) {
                    composerStartRestartGroup.startReplaceGroup(875507407);
                    composerStartRestartGroup.endReplaceGroup();
                    premiumBusBookingCardData = premiumBusBookingCardData2;
                } else {
                    composerStartRestartGroup.startReplaceGroup(875507408);
                    premiumBusBookingCardData = premiumBusBookingCardData2;
                    if (premiumBusBookingCardData == null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    b(z4, function1, list, composerStartRestartGroup, i6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (titoRideDataAppModel == null) {
                    composerStartRestartGroup.startReplaceGroup(1126859072);
                    composerStartRestartGroup.endReplaceGroup();
                    obj2 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1126859073);
                    Modifier modifierAlign5 = boxScopeInstance.align(ShadowKt.m4219shadows4CzXII$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, f, 7, null), ChaloTheme.c(composerStartRestartGroup, 0).f, ChaloTheme.d(composerStartRestartGroup, 0).e, true, 0L, 0L, 24, null), companion3.getBottomCenter());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    long currentCompositeKeyHashCode8 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i14 = (int) ((currentCompositeKeyHashCode8 >>> 32) ^ currentCompositeKeyHashCode8);
                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign5);
                    constructor = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl8 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion4, composerM3915constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM3915constructorimpl8, currentCompositionLocalMap8);
                    Updater.m3923setimpl(composerM3915constructorimpl8, modifierMaterializeModifier8, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl8, Integer.valueOf(i14), composerM3915constructorimpl8));
                    ValidationProduct.Companion companion10 = ValidationProduct.INSTANCE;
                    obj2 = null;
                    TitoRideDetailsBottomSheetLayoutKt.a(titoRideDataAppModel, null, function1, composerStartRestartGroup, (i5 << 3) & 896);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (premiumBusBookingCardData == null) {
                    composerStartRestartGroup.startReplaceGroup(1127539336);
                } else {
                    composerStartRestartGroup.startReplaceGroup(1127539337);
                    Modifier modifierAlign6 = boxScopeInstance.align(ShadowKt.m4219shadows4CzXII$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj2), 0.0f, 0.0f, 0.0f, f, 7, null), ChaloTheme.c(composerStartRestartGroup, 0).f, ChaloTheme.d(composerStartRestartGroup, 0).e, true, 0L, 0L, 24, null), companion3.getBottomCenter());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy8 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    long currentCompositeKeyHashCode9 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                    int i15 = (int) (currentCompositeKeyHashCode9 ^ (currentCompositeKeyHashCode9 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign6);
                    constructor2 = companion4.getConstructor();
                    if (!(composerStartRestartGroup.getApplier() != null)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM3915constructorimpl9 = Updater.m3915constructorimpl(composerStartRestartGroup);
                    pk0.v(companion4, composerM3915constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy8, composerM3915constructorimpl9, currentCompositionLocalMap9);
                    Updater.m3923setimpl(composerM3915constructorimpl9, modifierMaterializeModifier9, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl9, Integer.valueOf(i15), composerM3915constructorimpl9));
                    PremiumBusUpcomingBottomSheetLayoutKt.e(premiumBusBookingCardData, null, function1, composerStartRestartGroup, (i5 << 3) & 896);
                    composerStartRestartGroup.endNode();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                function3 = function2;
            }
            objRememberedValue = new xd(function1, 2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            TabMetaDataAppModel.Companion companion11 = TabMetaDataAppModel.INSTANCE;
            TabHeaderKt.f(null, tabMetaDataAppModel, function4, function5, function6, function7, function0, function3, str, z8, profileDrawerCardData, z2, null, null, null, null, null, list2, (Function2) objRememberedValue, composerStartRestartGroup, 64, 0, 126977);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            list = homeScreenViewState.c;
            if (list == null) {
                composerStartRestartGroup.startReplaceGroup(875507407);
                composerStartRestartGroup.endReplaceGroup();
                premiumBusBookingCardData = premiumBusBookingCardData2;
            } else {
                composerStartRestartGroup.startReplaceGroup(875507408);
                premiumBusBookingCardData = premiumBusBookingCardData2;
                if (premiumBusBookingCardData == null) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                b(z4, function1, list, composerStartRestartGroup, i6);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (titoRideDataAppModel == null) {
                composerStartRestartGroup.startReplaceGroup(1126859072);
                composerStartRestartGroup.endReplaceGroup();
                obj2 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1126859073);
                Modifier modifierAlign7 = boxScopeInstance.align(ShadowKt.m4219shadows4CzXII$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, f, 7, null), ChaloTheme.c(composerStartRestartGroup, 0).f, ChaloTheme.d(composerStartRestartGroup, 0).e, true, 0L, 0L, 24, null), companion3.getBottomCenter());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy9 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                long currentCompositeKeyHashCode10 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i16 = (int) ((currentCompositeKeyHashCode10 >>> 32) ^ currentCompositeKeyHashCode10);
                CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier10 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign7);
                constructor = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl10 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl10, measurePolicyMaybeCachedBoxMeasurePolicy9, composerM3915constructorimpl10, currentCompositionLocalMap10);
                Updater.m3923setimpl(composerM3915constructorimpl10, modifierMaterializeModifier10, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl10, Integer.valueOf(i16), composerM3915constructorimpl10));
                ValidationProduct.Companion companion12 = ValidationProduct.INSTANCE;
                obj2 = null;
                TitoRideDetailsBottomSheetLayoutKt.a(titoRideDataAppModel, null, function1, composerStartRestartGroup, (i5 << 3) & 896);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (premiumBusBookingCardData == null) {
                composerStartRestartGroup.startReplaceGroup(1127539336);
            } else {
                composerStartRestartGroup.startReplaceGroup(1127539337);
                Modifier modifierAlign8 = boxScopeInstance.align(ShadowKt.m4219shadows4CzXII$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, obj2), 0.0f, 0.0f, 0.0f, f, 7, null), ChaloTheme.c(composerStartRestartGroup, 0).f, ChaloTheme.d(composerStartRestartGroup, 0).e, true, 0L, 0L, 24, null), companion3.getBottomCenter());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy10 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                long currentCompositeKeyHashCode11 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i17 = (int) (currentCompositeKeyHashCode11 ^ (currentCompositeKeyHashCode11 >>> 32));
                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier11 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign8);
                constructor2 = companion4.getConstructor();
                if (!(composerStartRestartGroup.getApplier() != null)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3915constructorimpl11 = Updater.m3915constructorimpl(composerStartRestartGroup);
                pk0.v(companion4, composerM3915constructorimpl11, measurePolicyMaybeCachedBoxMeasurePolicy10, composerM3915constructorimpl11, currentCompositionLocalMap11);
                Updater.m3923setimpl(composerM3915constructorimpl11, modifierMaterializeModifier11, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion4, composerM3915constructorimpl11, Integer.valueOf(i17), composerM3915constructorimpl11));
                PremiumBusUpcomingBottomSheetLayoutKt.e(premiumBusBookingCardData, null, function1, composerStartRestartGroup, (i5 << 3) & 896);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: j80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    HomeTabScaffoldKt.d(homeScreenViewState, function1, z, i, f, (Composer) obj3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void e(Function1 function1, List list, String str, Composer composer, int i) {
        List list2 = list;
        Composer composerStartRestartGroup = composer.startRestartGroup(255590102);
        Function1 function2 = function1;
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(255590102, i2, -1, "app.chalo.home.ui.home.HomeTabHooksUI (HomeTabScaffold.kt:742)");
            }
            if (list2 == null) {
                composerStartRestartGroup.startReplaceGroup(-692102985);
            } else {
                composerStartRestartGroup.startReplaceGroup(-692102984);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(BackgroundKt.m264backgroundbw27NRU$default(companion, ChaloTheme.a(composerStartRestartGroup, 0).Z, null, 2, null), 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                if (str == null) {
                    composerStartRestartGroup.startReplaceGroup(-417296221);
                } else {
                    composerStartRestartGroup.startReplaceGroup(-417296220);
                    ChaloTabTitleKt.a(composerStartRestartGroup, 0, str);
                }
                composerStartRestartGroup.endReplaceGroup();
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                for (Object obj : list2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    arrayList.add(ComposableLambdaKt.composableLambdaInstance(1207458552, true, new u6((HomePageGridItemData) obj, list2, i4, modifierFillMaxHeight$default, function2)));
                    function2 = function1;
                    list2 = list;
                    i4 = i5;
                }
                ChaloGridLayoutKt.b(modifierFillMaxWidth$default, arrayList, 0, 0.0f, 0.0f, composerStartRestartGroup, 6);
                ChaloSpacersKt.p(composerStartRestartGroup, 0);
                composerStartRestartGroup.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ir(i, 14, function1, list, str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void f(HomeScreenViewState viewState, Function1 sendIntent, SheetState modalBottomSheetState, HomeTabCallbacks homeTabCallbacks, boolean z, int i, Composer composer, int i2) {
        int i3;
        int i4;
        Composer composer2;
        boolean z2;
        Object homeTabScaffoldKt$HomeTabScaffold$1$1;
        HomeScreenBottomSheetType homeScreenBottomSheetType;
        ?? r14;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(modalBottomSheetState, "modalBottomSheetState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1212110561);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modalBottomSheetState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(homeTabCallbacks) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 = i;
            i3 |= composerStartRestartGroup.changed(i4) ? 131072 : 65536;
        } else {
            i4 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1212110561, i3, -1, "app.chalo.home.ui.home.HomeTabScaffold (HomeTabScaffold.kt:97)");
            }
            HomeScreenBottomSheetType homeScreenBottomSheetType2 = viewState.e;
            PremiumBusInAppCommunicationBottomSheetData premiumBusInAppCommunicationBottomSheetData = viewState.h;
            if (Intrinsics.d(homeScreenBottomSheetType2, HomeScreenBottomSheetType.PremiumBusInAppCommunicationBottomSheet.f3534a)) {
                z2 = false;
            } else {
                if (homeScreenBottomSheetType2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                z2 = true;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zChanged = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & 896) == 256) | composerStartRestartGroup.changed(homeScreenBottomSheetType2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                homeScreenBottomSheetType = homeScreenBottomSheetType2;
                r14 = 1;
                homeTabScaffoldKt$HomeTabScaffold$1$1 = new HomeTabScaffoldKt$HomeTabScaffold$1$1(z, homeTabCallbacks, modalBottomSheetState, homeScreenBottomSheetType, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(homeTabScaffoldKt$HomeTabScaffold$1$1);
            } else {
                homeTabScaffoldKt$HomeTabScaffold$1$1 = objRememberedValue2;
                r14 = 1;
                homeScreenBottomSheetType = homeScreenBottomSheetType2;
            }
            EffectsKt.LaunchedEffect(homeScreenBottomSheetType, boolValueOf, (Function2) homeTabScaffoldKt$HomeTabScaffold$1$1, composerStartRestartGroup, (i3 >> 9) & 112);
            int i5 = i3 & 112;
            ?? r2 = (composerStartRestartGroup.changed(homeScreenBottomSheetType) ? 1 : 0) | (composerStartRestartGroup.changed(premiumBusInAppCommunicationBottomSheetData) ? 1 : 0) | (i5 == 32 ? r14 : 0);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (r2 != 0 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new m(13, homeScreenBottomSheetType, premiumBusInAppCommunicationBottomSheetData, sendIntent);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-902047414);
                HomeScreenDialogType homeScreenDialogType = viewState.o;
                if (homeScreenDialogType == null) {
                    composerStartRestartGroup.startReplaceGroup(2101301239);
                } else {
                    composerStartRestartGroup.startReplaceGroup(2101301240);
                    c(homeScreenDialogType, sendIntent, composerStartRestartGroup, i5);
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2094826115);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (homeScreenBottomSheetType != null) {
                composerStartRestartGroup.startReplaceGroup(2101495734);
                composer2 = composerStartRestartGroup;
                ChaloRoundedBottomSheetKt.a(modalBottomSheetState, function0, z2, false, false, ComposableLambdaKt.rememberComposableLambda(673935703, r14, new ob(12, homeScreenBottomSheetType, premiumBusInAppCommunicationBottomSheetData, sendIntent), composerStartRestartGroup, 54), composer2, ((i3 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(2094826115);
            }
            composer2.endReplaceGroup();
            int i6 = i3 >> 6;
            d(viewState, sendIntent, z, i4, PlatformInsets_androidKt.a(0, composer2, r14), composer2, (i3 & WebSocketProtocol.PAYLOAD_SHORT) | (i6 & 896) | (i6 & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ph(viewState, sendIntent, modalBottomSheetState, homeTabCallbacks, z, i, i2));
        }
    }
}
