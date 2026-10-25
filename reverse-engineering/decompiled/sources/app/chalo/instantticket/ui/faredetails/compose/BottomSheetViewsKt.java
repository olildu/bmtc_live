package app.chalo.instantticket.ui.faredetails.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.WavUtil;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.instantticket.ui.faredetails.contract.UserBillingDataState;
import app.chalo.instantticket.ui.faredetails.contract.UserBillingInfoBottomSheetState;
import app.chalo.ondc.model.app.response.OndcBookingUiModel;
import app.chalo.ondc.model.app.response.OndcFareBreakupUiModel;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.gb;
import defpackage.gf;
import defpackage.hb;
import defpackage.jb;
import defpackage.ma;
import defpackage.pk0;
import defpackage.s4;
import defpackage.vc;
import defpackage.vo1;
import defpackage.wc;
import defpackage.xc;
import defpackage.ya;
import defpackage.yc;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BottomSheetViewsKt {
    public static final void a(Modifier modifier, UserBillingInfoBottomSheetState billingInfoBottomSheetState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(billingInfoBottomSheetState, "billingInfoBottomSheetState");
        int i3 = billingInfoBottomSheetState.d;
        UserBillingDataState userBillingDataState = billingInfoBottomSheetState.b;
        UserBillingDataState userBillingDataState2 = billingInfoBottomSheetState.f3952a;
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-786628649);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(billingInfoBottomSheetState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-786628649, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.BillingDetails (BottomSheetViews.kt:186)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(userBillingDataState2.f3951a, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(userBillingDataState.f3951a, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue2;
            boolean zChanged = composerStartRestartGroup.changed(i3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = Integer.valueOf(i3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue = ((Number) objRememberedValue3).intValue();
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i5 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.ENTER_BILLING_DETAILS, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131070);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.RECEIPT_WILL_BE_SENT_HERE, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131070);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).g);
            TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
            TextStyle textStyleG = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0));
            int i6 = i5 & 896;
            boolean z = i6 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new xc(mutableState, sendIntent, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ChaloTextFieldKt.a(textFieldValue, (Function1) objRememberedValue4, modifierM784padding3ABfNKs, false, false, textStyleG, ComposableSingletons$BottomSheetViewsKt.f3910a, null, null, null, false, null, null, null, false, 0, null, null, null, null, composerStartRestartGroup, 1572864, 0, 1048472);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).g), composerStartRestartGroup, 0);
            Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).g);
            TextFieldValue textFieldValue2 = (TextFieldValue) mutableState2.getValue();
            TextStyle textStyleG2 = ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0));
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6977getNumberPjHm6EE(), ImeAction.INSTANCE.m6921getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            boolean zChanged2 = composerStartRestartGroup.changed(iIntValue) | (i6 == 256);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new yc(mutableState2, sendIntent, iIntValue);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            ChaloTextFieldKt.a(textFieldValue2, (Function1) objRememberedValue5, modifierM784padding3ABfNKs2, false, false, textStyleG2, ComposableSingletons$BottomSheetViewsKt.b, null, null, null, false, null, keyboardOptions, null, false, 0, null, null, null, null, composerStartRestartGroup, 1572864, 384, 1044376);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion3, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.PROCEED, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            boolean z2 = userBillingDataState2.b && userBillingDataState.b;
            boolean z3 = i6 == 256;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new ya(sendIntent, 20);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            ChaloFilledButtonKt.g(modifierFillMaxWidth$default, strC, null, 0L, null, z2, 0.0f, null, 0L, (Function0) objRememberedValue6, composerStartRestartGroup, 6, 476);
            composer2 = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 6, modifier, billingInfoBottomSheetState, sendIntent));
        }
    }

    public static final void b(Modifier modifier, OndcBookingUiModel fareDetails, boolean z, Function0 onPayButtonClick, Function0 onCancelClick, Function0 onTncClick, Composer composer, int i) {
        int i2;
        int i3;
        Intrinsics.i(fareDetails, "fareDetails");
        OndcFareBreakupUiModel ondcFareBreakupUiModel = fareDetails.b;
        String str = ondcFareBreakupUiModel.c;
        Intrinsics.i(onPayButtonClick, "onPayButtonClick");
        Intrinsics.i(onCancelClick, "onCancelClick");
        Intrinsics.i(onTncClick, "onTncClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-92502963);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(fareDetails) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPayButtonClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCancelClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTncClick) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i2) != 74898, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92502963, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.FareBreakupAndFinalFareBottomSheet (BottomSheetViews.kt:48)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.PAY_FOR_X, new Object[]{str}, composerStartRestartGroup, 6), null, 0L, null, TextUnitKt.getSp(24), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0))), composerStartRestartGroup, 24576, 0, 131054);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            List list = fareDetails.f6780a;
            if (list == null) {
                composerStartRestartGroup.startReplaceGroup(-705415603);
                composerStartRestartGroup.endReplaceGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceGroup(-705415602);
                composerStartRestartGroup.startReplaceGroup(-2100964358);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    FareBreakupSectionKt.d(null, (OndcFareBreakupUiModel) it.next(), composerStartRestartGroup, 0);
                    SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
                }
                i3 = 0;
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                DividerKt.m1950HorizontalDivider9IZ8Weo(PaddingKt.m786paddingVpY3zN4$default(companion3, 0.0f, ChaloTheme.b(composerStartRestartGroup, 0).f, 1, null), 0.0f, 0L, composerStartRestartGroup, 0, 6);
                gf.r(companion3, ChaloTheme.b(composerStartRestartGroup, 0).f, composerStartRestartGroup, 0);
            }
            FareBreakupSectionKt.d(null, ondcFareBreakupUiModel, composerStartRestartGroup, i3);
            String str2 = fareDetails.c;
            if (str2 == null) {
                composerStartRestartGroup.startReplaceGroup(-704930949);
            } else {
                composerStartRestartGroup.startReplaceGroup(-704930948);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, i3).i), composerStartRestartGroup, i3);
                FareRouteAndStopDetailsViewKt.e(composerStartRestartGroup, i3, str2);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-704774956);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, i3).g), composerStartRestartGroup, i3);
                boolean z2 = (458752 & i2) == 131072;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new hb(onTncClick, 3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                i3 = 0;
                e(0, composerStartRestartGroup, null, (Function0) objRememberedValue);
            } else {
                composerStartRestartGroup.startReplaceGroup(-707949697);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, i3).k), composerStartRestartGroup, i3);
            StringEnum stringEnum = StringEnum.PAY_PREFIX;
            Object[] objArr = new Object[1];
            objArr[i3] = str;
            int i5 = i3;
            ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), StringResourcesHelperKt.c(stringEnum, objArr, composerStartRestartGroup, 6), null, 0L, ChaloTheme.d(composerStartRestartGroup, i3).g, false, 0.0f, null, 0L, onPayButtonClick, composerStartRestartGroup, ((i2 << 18) & 1879048192) | 6, 492);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion4, ChaloTheme.b(composerStartRestartGroup, i5).h), composerStartRestartGroup, i5);
            ChaloFilledButtonKt.f(StringResourcesHelperKt.c(StringEnum.CANCEL_SMALL, new Object[i5], composerStartRestartGroup, 6), false, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), null, ChaloTheme.d(composerStartRestartGroup, i5).g, 0.0f, 0L, onCancelClick, composerStartRestartGroup, ((i2 << 9) & 29360128) | 384, 106);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new wc(modifier, fareDetails, z, onPayButtonClick, onCancelClick, onTncClick, i, 0));
        }
    }

    public static final void c(Modifier modifier, String totalAmount, boolean z, Function0 onPayButtonClick, Function0 function0, Composer composer, int i) {
        int i2;
        Function0 onTncClick = function0;
        Intrinsics.i(totalAmount, "totalAmount");
        Intrinsics.i(onPayButtonClick, "onPayButtonClick");
        Intrinsics.i(onTncClick, "onTncClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1221331125);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(totalAmount) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPayButtonClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTncClick) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1221331125, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsFinalFareBottomSheet (BottomSheetViews.kt:102)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            int i4 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.TEXT_PAYING_FOR_TICKET, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(totalAmount, null, ChaloTheme.a(composerStartRestartGroup, 0).e, null, TextUnitKt.getSp(40), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.f(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, ((i4 >> 3) & 14) | 24576, 0, 131050);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).i), composerStartRestartGroup, 0);
            ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), StringResourcesHelperKt.c(StringEnum.FARE_DETAILS_PAY, new Object[]{totalAmount}, composerStartRestartGroup, 6), null, 0L, null, false, 0.0f, null, 0L, onPayButtonClick, composerStartRestartGroup, ((i4 << 18) & 1879048192) | 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-645238280);
                SpacerKt.Spacer(SizeKt.m814height3ABfNKs(companion2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
                boolean z2 = (i4 & 57344) == 16384;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    onTncClick = function0;
                    objRememberedValue = new hb(onTncClick, 2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    onTncClick = function0;
                }
                e(0, composerStartRestartGroup, null, (Function0) objRememberedValue);
            } else {
                onTncClick = function0;
                composerStartRestartGroup.startReplaceGroup(-650285917);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new ma(modifier, totalAmount, z, onPayButtonClick, onTncClick, i, 1));
        }
    }

    public static final void d(int i, Composer composer, Modifier modifier, String fareNote, Function0 onGotItClick) {
        int i2;
        Composer composer2;
        Modifier modifier2;
        Intrinsics.i(fareNote, "fareNote");
        Intrinsics.i(onGotItClick, "onGotItClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1515789599);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(fareNote) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onGotItClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1515789599, i3, -1, "app.chalo.instantticket.ui.faredetails.compose.FareNoteBottomSheet (BottomSheetViews.kt:286)");
            }
            Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM785paddingVpY3zN4);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            TextStyle textStyleL = ChaloTypographyKt.l(ChaloTheme.e(composerStartRestartGroup, 0));
            modifier2 = companion;
            TextKt.m2623TextNvy7gAk(fareNote, modifierFillMaxWidth$default, ChaloTheme.a(composerStartRestartGroup, 0).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleL, composerStartRestartGroup, (i3 & 14) | 48, 0, 131064);
            SpacerKt.Spacer(SizeKt.m814height3ABfNKs(modifier2, ChaloTheme.b(composerStartRestartGroup, 0).h), composerStartRestartGroup, 0);
            ChaloFilledButtonKt.g(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), StringResourcesHelperKt.c(StringEnum.GOT_IT, new Object[0], composerStartRestartGroup, 6), null, 0L, null, false, 0.0f, null, 0L, onGotItClick, composerStartRestartGroup, ((i3 << 21) & 1879048192) | 6, TypedValues.PositionType.TYPE_CURVE_FIT);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new vc(fareNote, modifier2, onGotItClick, i, 0));
        }
    }

    public static final void e(int i, Composer composer, Modifier modifier, Function0 onActionClicked) {
        Modifier modifier2;
        Intrinsics.i(onActionClicked, "onActionClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-324182148);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onActionClicked) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            modifier2 = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-324182148, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.TermsAndConditionText (BottomSheetViews.kt:142)");
            }
            String strA = vo1.A(StringResourcesHelperKt.c(StringEnum.TNC_PREFIX, new Object[0], composerStartRestartGroup, 6), " ");
            String strC = StringResourcesHelperKt.c(StringEnum.TNC_CLICKABLE_TEXT, new Object[0], composerStartRestartGroup, 6);
            long j = ChaloTheme.a(composerStartRestartGroup, 0).f1915a;
            composerStartRestartGroup.startReplaceGroup(1993578955);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            int iPushStyle = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).toSpanStyle(), ChaloTheme.a(composerStartRestartGroup, 0).e, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null));
            try {
                builder.append(strA);
                builder.pop(iPushStyle);
                int iPushStyle2 = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(ChaloTypographyKt.d(ChaloTheme.e(composerStartRestartGroup, 0)).toSpanStyle(), j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null));
                try {
                    builder.append(strC);
                    builder.pop(iPushStyle2);
                    int iD = StringsKt.D(strA + strC, strC, 0, false, 6);
                    builder.addStringAnnotation("ClickableText", "", iD, strC.length() + iD);
                    int i3 = i2;
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    boolean zChanged = composerStartRestartGroup.changed(annotatedString) | ((i3 & 112) == 32);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new jb(annotatedString, onActionClicked, 1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    ClickableTextKt.m1101ClickableText4YKlhWE(annotatedString, modifier2, null, false, 0, 0, null, (Function1) objRememberedValue, composerStartRestartGroup, (i3 << 3) & 112, 124);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } catch (Throwable th) {
                    builder.pop(iPushStyle2);
                    throw th;
                }
            } catch (Throwable th2) {
                builder.pop(iPushStyle);
                throw th2;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(modifier2, onActionClicked, i, 1));
        }
    }
}
