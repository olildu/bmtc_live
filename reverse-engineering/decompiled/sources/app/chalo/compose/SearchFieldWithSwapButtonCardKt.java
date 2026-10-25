package app.chalo.compose;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.SearchFieldSectionType;
import app.chalo.compose.SearchFieldWithSwapButtonCardKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.FromAndToStopDetailViewKt;
import app.chalo.compose.components.PlotlineComposeWidgetKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.c41;
import defpackage.i41;
import defpackage.jf;
import defpackage.kq;
import defpackage.l61;
import defpackage.o01;
import defpackage.pk0;
import defpackage.vc;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SearchFieldWithSwapButtonCardKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1814a;

        static {
            int[] iArr = new int[SearchFieldSectionType.values().length];
            try {
                iArr[SearchFieldSectionType.WITH_PROCEED_BTN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchFieldSectionType.WITHOUT_PROCEED_BTN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1814a = iArr;
        }
    }

    public static final void a(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1072360163);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1072360163, i2, -1, "app.chalo.compose.ChaloIconWithTextWithRoundedBackground (SearchFieldWithSwapButtonCard.kt:312)");
            }
            Modifier modifierM263backgroundbw27NRU = BackgroundKt.m263backgroundbw27NRU(SizeKt.m814height3ABfNKs(modifier, ChaloTheme.b(composerStartRestartGroup, 6).m), ChaloTheme.a(composerStartRestartGroup, 6).A0, RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(Dp.m7278constructorimpl(20)));
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o01(function0, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM299clickableoSLSa3U$default = ClickableKt.m299clickableoSLSa3U$default(modifierM263backgroundbw27NRU, false, null, null, null, (Function0) objRememberedValue, 15, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM299clickableoSLSa3U$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            IconKt.m2070Iconww6aTOc(PainterResourceHelperKt.a(IconType.IC_CALENDAR_BLACK, composerStartRestartGroup, 6), "", SizeKt.m828size3ABfNKs(PaddingKt.m788paddingqDBjuR0$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 6).h, 0.0f, ChaloTheme.b(composerStartRestartGroup, 6).g, 0.0f, 10, null), ChaloTheme.b(composerStartRestartGroup, 6).h), ChaloTheme.a(composerStartRestartGroup, 6).e, composerStartRestartGroup, 48 | Painter.$stable, 0);
            TextStyle textStyleH = ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 6));
            Intrinsics.i(textStyleH, "<this>");
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m6753copyp1EtxEg$default(textStyleH, 0L, 0L, FontWeight.INSTANCE.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, (i2 >> 3) & 14, 0, 131070);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vc(modifier, str, function0, i, 4));
        }
    }

    public static final void b(final Modifier modifier, final String str, String str2, final String str3, String str4, TextStyle textStyle, final String str5, final String str6, final SearchFieldSectionType searchFieldSectionType, String str7, final boolean z, final Function1 onStopsFieldClicked, final Function0 timeFieldClicked, final Function0 dateFieldClicked, final Function0 swapSearchFieldsClicked, final Function0 proceedBtnClicked, Composer composer, final int i, final int i2) {
        int i3;
        String str8;
        String str9;
        int i4;
        boolean z2;
        Composer composer2;
        final String str10;
        final String str11;
        final TextStyle textStyle2;
        final String str12;
        int i5;
        final String strC;
        final TextStyle textStyle3;
        int i6;
        Intrinsics.i(onStopsFieldClicked, "onStopsFieldClicked");
        Intrinsics.i(timeFieldClicked, "timeFieldClicked");
        Intrinsics.i(dateFieldClicked, "dateFieldClicked");
        Intrinsics.i(swapSearchFieldsClicked, "swapSearchFieldsClicked");
        Intrinsics.i(proceedBtnClicked, "proceedBtnClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(999366922);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i7 = i3 | 3456;
        if ((i & 24576) == 0) {
            i7 = i3 | 11648;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            str8 = str3;
            i7 |= composerStartRestartGroup.changed(str8) ? 131072 : 65536;
        } else {
            str8 = str3;
        }
        int i8 = i7 | 14155776;
        if ((i & 100663296) == 0) {
            i8 = i7 | 47710208;
        }
        if ((i & 805306368) == 0) {
            i8 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            str9 = str5;
            i4 = i2 | (composerStartRestartGroup.changed(str9) ? 4 : 2);
        } else {
            str9 = str5;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(str6) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(searchFieldSectionType == null ? -1 : searchFieldSectionType.ordinal()) ? 256 : 128;
        }
        int i9 = i4;
        if ((i2 & 3072) == 0) {
            i9 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            z2 = z;
            i9 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onStopsFieldClicked) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(timeFieldClicked) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(dateFieldClicked) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(swapSearchFieldsClicked) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(proceedBtnClicked) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute(((i8 & 306783379) == 306783378 && (i9 & 306783379) == 306783378) ? false : true, i8 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                str2 = StringResourcesHelperKt.c(StringEnum.ENTER_ORIGIN_LOCATION, new Object[0], composerStartRestartGroup, 6);
                String strC2 = StringResourcesHelperKt.c(StringEnum.ENTER_DESTINATION_LOCATION, new Object[0], composerStartRestartGroup, 6);
                TextStyle textStyleB = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 6));
                str4 = strC2;
                i5 = i9 & (-7169);
                strC = StringResourcesHelperKt.c(StringEnum.PROCEED, new Object[0], composerStartRestartGroup, 6);
                textStyle3 = textStyleB;
                i6 = i8 & (-2113986561);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                i6 = i8 & (-2113986561);
                i5 = i9 & (-7169);
                textStyle3 = textStyle;
                strC = str7;
            }
            final String str13 = str4;
            int i10 = i5;
            final String str14 = str2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999366922, i6, i10, "app.chalo.compose.SearchFieldWithSwapButtonCard (SearchFieldWithSwapButtonCard.kt:74)");
            }
            Modifier modifierA = PlotlineComposeWidgetKt.a(modifier, "PL_Search_Card");
            CardElevation cardElevationM1695cardElevationaqJV_2Y = CardDefaults.INSTANCE.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 6).c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, CardDefaults.$stable << 18, 62);
            RoundedCornerShape roundedCornerShapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composerStartRestartGroup, 6).f);
            final String str15 = str9;
            final String str16 = str8;
            final boolean z3 = z2;
            TextStyle textStyle4 = textStyle3;
            CardKt.Card(modifierA, roundedCornerShapeM1074RoundedCornerShape0680j_4, null, cardElevationM1695cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(-130593412, true, new Function3() { // from class: m61
                /* JADX WARN: Code duplicated, block: B:44:0x0199  */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f;
                    ColumnScope Card = (ColumnScope) obj;
                    Composer composer3 = (Composer) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    Intrinsics.i(Card, "$this$Card");
                    if (composer3.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-130593412, iIntValue, -1, "app.chalo.compose.SearchFieldWithSwapButtonCard.<anonymous> (SearchFieldWithSwapButtonCard.kt:80)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(PaddingKt.m788paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, ChaloTheme.b(composer3, 6).h, 0.0f, 0.0f, 13, null), null, null, 3, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0);
                        int i11 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierAnimateContentSize$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer3);
                        pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                        Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i11), composerM3915constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        SearchFieldWithSwapButtonCardKt.d(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer3, 6).h, 0.0f, 2, null), str, str14, str16, str13, onStopsFieldClicked, swapSearchFieldsClicked, textStyle3, composer3, 0, 0);
                        Composer composer4 = composer3;
                        SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composer4, 6).h), composer4, 0);
                        SearchFieldSectionType searchFieldSectionType2 = searchFieldSectionType;
                        int i12 = searchFieldSectionType2 == null ? -1 : SearchFieldWithSwapButtonCardKt.WhenMappings.f1814a[searchFieldSectionType2.ordinal()];
                        String str17 = str15;
                        String str18 = str6;
                        Function0 function0 = timeFieldClicked;
                        Function0 function1 = dateFieldClicked;
                        if (i12 == -1) {
                            composer4.startReplaceGroup(1354710138);
                            if (str17 != null || str18 == null) {
                                composer4.startReplaceGroup(1355162211);
                                f = ChaloTheme.b(composer4, 6).f;
                            } else {
                                composer4.startReplaceGroup(1354769441);
                                SearchFieldWithSwapButtonCardKt.c(0, composer4, null, str17, str18, function0, function1);
                                f = ChaloTheme.b(composer4, 6).h;
                            }
                            gf.r(companion, f, composer4, 0);
                            composer4.endReplaceGroup();
                        } else if (i12 != 1) {
                            if (i12 != 2) {
                                throw pk0.p(composer4, 1152044154);
                            }
                            composer4.startReplaceGroup(1354710138);
                            if (str17 != null) {
                                composer4.startReplaceGroup(1355162211);
                                f = ChaloTheme.b(composer4, 6).f;
                            } else {
                                composer4.startReplaceGroup(1355162211);
                                f = ChaloTheme.b(composer4, 6).f;
                            }
                            gf.r(companion, f, composer4, 0);
                            composer4.endReplaceGroup();
                        } else {
                            composer4.startReplaceGroup(1353690486);
                            if (str17 == null || str18 == null) {
                                composer4.startReplaceGroup(1349192944);
                                composer4.endReplaceGroup();
                            } else {
                                composer4.startReplaceGroup(1353738753);
                                SearchFieldWithSwapButtonCardKt.c(0, composer4, null, str17, str18, function0, function1);
                                gf.r(companion, ChaloTheme.b(composer4, 6).h, composer4, 0);
                            }
                            ChaloFilledButtonKt.g(PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer4, 6).h, 0.0f, 2, null), strC, null, 0L, null, z3, 0.0f, null, 0L, proceedBtnClicked, composer4, 0, 476);
                            composer4 = composer4;
                            gf.r(companion, ChaloTheme.b(composer4, 6).h, composer4, 0);
                        }
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 20);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str11 = str13;
            textStyle2 = textStyle4;
            str10 = str14;
            str12 = strC;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            str10 = str2;
            str11 = str4;
            textStyle2 = textStyle;
            str12 = str7;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: k61
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(i | 1);
                    int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(i2);
                    SearchFieldWithSwapButtonCardKt.b(modifier, str, str10, str3, str11, textStyle2, str5, str6, searchFieldSectionType, str12, z, onStopsFieldClicked, timeFieldClicked, dateFieldClicked, swapSearchFieldsClicked, proceedBtnClicked, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2);
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void c(int i, Composer composer, Modifier modifier, String time, String date, Function0 onTimeClicked, Function0 onDateClicked) {
        Modifier modifier2;
        Intrinsics.i(time, "time");
        Intrinsics.i(date, "date");
        Intrinsics.i(onTimeClicked, "onTimeClicked");
        Intrinsics.i(onDateClicked, "onDateClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-817880004);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(time) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(date) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTimeClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDateClicked) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-817880004, i2, -1, "app.chalo.compose.TimeAndDateSelectField (SearchFieldWithSwapButtonCard.kt:282)");
            }
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            modifier2 = companion;
            Modifier modifierA = i41.a(rowScopeInstance, modifier2, 1.0f, false, 2, null);
            boolean z = (57344 & i2) == 16384;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new o01(onDateClicked, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            a((i2 >> 3) & 112, composerStartRestartGroup, modifierA, date, (Function0) objRememberedValue);
            ChaloSpacersKt.y(composerStartRestartGroup, 0);
            Modifier modifierA2 = i41.a(rowScopeInstance, modifier2, 1.0f, false, 2, null);
            boolean z2 = (i2 & 7168) == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new o01(onTimeClicked, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            a(i2 & 112, composerStartRestartGroup, modifierA2, time, (Function0) objRememberedValue2);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new jf(modifier2, time, date, onTimeClicked, onDateClicked, i));
        }
    }

    public static final void d(Modifier modifier, String str, String str2, String str3, String str4, Function1 function1, Function0 function0, TextStyle textStyle, Composer composer, int i, int i2) {
        int i3;
        String str5;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-485732391);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(false) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed((Object) null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str5 = str2;
            i3 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
        } else {
            str5 = str2;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(false) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerStartRestartGroup.changed((Object) null) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(str4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
        }
        int i5 = i4;
        if (composerStartRestartGroup.shouldExecute(((i3 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-485732391, i3, i5, "app.chalo.compose.TripPlannerSearchFieldComponent (SearchFieldWithSwapButtonCard.kt:164)");
            }
            Modifier modifierHeight = IntrinsicKt.height(modifier, IntrinsicSize.Min);
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i6 = i3;
            int i7 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierHeight);
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
            pk0.v(companion2, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i7), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            FromAndToStopDetailViewKt.e(0.0f, 0.0f, composerStartRestartGroup, 0, 3);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 6).g), composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(i41.a(rowScopeInstance, companion3, 1.0f, false, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            pk0.v(companion2, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i8), composerM3915constructorimpl2));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierA = PlotlineComposeWidgetKt.a(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), "PL_From_Stop_Text");
            int i9 = i6 & 1879048192;
            boolean z = i9 == 536870912;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new c41(function1, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i10 = (i5 << 15) & 3670016;
            boolean z2 = true;
            e(modifierA, str, str5, (Function0) objRememberedValue, textStyle, composerStartRestartGroup, (i6 & 65520) | i10);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 6).h), composerStartRestartGroup, 0);
            Modifier modifierA2 = PlotlineComposeWidgetKt.a(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), "PL_To_Stop_Text");
            if (i9 != 536870912) {
                z2 = false;
            }
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new c41(function1, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            e(modifierA2, str3, str4, (Function0) objRememberedValue2, textStyle, composerStartRestartGroup, ((i6 >> 12) & 65520) | i10);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m833width3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 6).f), composerStartRestartGroup, 0);
            ImageKt.Image(PainterResourceHelperKt.a(IconType.SWAP_PLANNER, composerStartRestartGroup, 6), (String) null, ClickableKt.m295clickableO2vRcR0$default(BackgroundKt.m263backgroundbw27NRU(ClipKt.clip(SizeKt.m828size3ABfNKs(PlotlineComposeWidgetKt.a(companion3, "PL_Swap_Button"), ChaloTheme.b(composerStartRestartGroup, 6).l), RoundedCornerShapeKt.getCircleShape()), ChaloTheme.a(composerStartRestartGroup, 6).A, RoundedCornerShapeKt.getCircleShape()), RippleEffectKt.b(composerStartRestartGroup), RippleEffectKt.a(composerStartRestartGroup), false, null, null, function0, 28, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 24624, 104);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kq(modifier, str, str2, str3, str4, function1, function0, textStyle, i, i2));
        }
    }

    public static final void e(Modifier modifier, String str, String str2, Function0 function0, TextStyle textStyle, Composer composer, int i) {
        int i2;
        String str3;
        Function0 function1;
        TextStyle textStyle2;
        TextStyle textStyle3;
        long j;
        Composer composerStartRestartGroup = composer.startRestartGroup(1917400301);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(false) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed((Object) null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            str3 = str2;
            i2 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
        } else {
            str3 = str2;
        }
        if ((196608 & i) == 0) {
            function1 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        } else {
            function1 = function0;
        }
        if ((1572864 & i) == 0) {
            textStyle2 = textStyle;
            i2 |= composerStartRestartGroup.changed(textStyle2) ? 1048576 : 524288;
        } else {
            textStyle2 = textStyle;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i2) != 599186, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1917400301, i2, -1, "app.chalo.compose.TripPlannerSearchText (SearchFieldWithSwapButtonCard.kt:237)");
            }
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(80731826);
                TextStyle textStyleB = ChaloTypographyKt.b(ChaloTheme.e(composerStartRestartGroup, 6));
                composerStartRestartGroup.endReplaceGroup();
                textStyle3 = textStyleB;
            } else {
                composerStartRestartGroup.startReplaceGroup(80732541);
                composerStartRestartGroup.endReplaceGroup();
                textStyle3 = textStyle2;
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-592253365);
            composerStartRestartGroup.endReplaceGroup();
            String str4 = str == null ? str3 : str;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(ClickableKt.m299clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), false, null, null, null, function1, 15, null), 0.0f, ChaloTheme.b(composerStartRestartGroup, 6).f, 1, null);
            if (str != null) {
                composerStartRestartGroup.startReplaceGroup(-1819903300);
                j = ChaloTheme.a(composerStartRestartGroup, 6).e;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1819902401);
                j = ChaloTheme.a(composerStartRestartGroup, 6).k;
            }
            composerStartRestartGroup.endReplaceGroup();
            TextKt.m2623TextNvy7gAk(str4, modifierM786paddingVpY3zN4$default, j, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8(), false, 1, 0, null, textStyle3, composerStartRestartGroup, 0, 24960, 110584);
            composerStartRestartGroup = composerStartRestartGroup;
            DividerKt.m1949Divider9IZ8Weo(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 6).c, ChaloTheme.a(composerStartRestartGroup, 6).m, composerStartRestartGroup, 6, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new l61(modifier, str, str3, function0, textStyle, i, 0));
        }
    }
}
