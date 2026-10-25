package app.chalo.instantticket.ui.faredetails.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.ModalBottomSheetKt;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import app.chalo.compose.BackHandlerKt;
import app.chalo.compose.ChaloTncBottomSheetKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.instantticket.ui.faredetails.FareDetailsComponent;
import app.chalo.instantticket.ui.faredetails.FareDetailsScreenType;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsBottomSheetType;
import app.chalo.instantticket.ui.faredetails.contract.FareDetailsViewState;
import app.chalo.instantticket.ui.faredetails.contract.UserBillingInfoBottomSheetState;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessComponent;
import app.chalo.instantticket.ui.instantticketscreen.InstantTicketWalletAccessState;
import app.chalo.instantticket.ui.instantticketscreen.compose.InstantTicketWalletAccessSideEffectSetupKt;
import app.chalo.ondc.model.app.response.OndcBookingUiModel;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.utils.SheetDefaultsHelperKt;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.fk;
import defpackage.gf;
import defpackage.i41;
import defpackage.pk0;
import defpackage.r20;
import defpackage.s20;
import defpackage.t20;
import defpackage.u20;
import defpackage.wb;
import defpackage.yi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsViewState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessState;", "instantTicketWalletAccessState", "productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FareDetailsBaseComposableKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(FareDetailsComponent vm, InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, Composer composer, int i) {
        int i2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        r20 r20Var;
        Intrinsics.i(vm, "vm");
        Intrinsics.i(instantTicketWalletAccessComponent, "instantTicketWalletAccessComponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-778472169);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(vm) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(instantTicketWalletAccessComponent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-778472169, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsBaseComposable (FareDetailsBaseComposable.kt:52)");
            }
            FareDetailsScreenType fareDetailsScreenType = ((FareDetailsViewState) SubscribeAsStateKt.a(vm.t0(), composerStartRestartGroup).getValue()).n;
            if (!Intrinsics.d(fareDetailsScreenType, FareDetailsScreenType.InstantTicket.INSTANCE)) {
                if (fareDetailsScreenType instanceof FareDetailsScreenType.ONDCTicket) {
                    composerStartRestartGroup.startReplaceGroup(1359514326);
                    b(vm, composerStartRestartGroup, i2 & 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (fareDetailsScreenType != null) {
                        throw pk0.p(composerStartRestartGroup, -787438304);
                    }
                    composerStartRestartGroup.startReplaceGroup(1359582309);
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    } else {
                        r20Var = new r20(vm, instantTicketWalletAccessComponent, i, 0);
                    }
                }
                scopeUpdateScopeEndRestartGroup.updateScope(r20Var);
            }
            composerStartRestartGroup.startReplaceGroup(1359282477);
            d(vm, instantTicketWalletAccessComponent, composerStartRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            r20Var = new r20(vm, instantTicketWalletAccessComponent, i, 1);
            scopeUpdateScopeEndRestartGroup.updateScope(r20Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final FareDetailsComponent vm, Composer composer, int i) {
        int i2;
        Intrinsics.i(vm, "vm");
        Composer composerStartRestartGroup = composer.startRestartGroup(724293226);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(vm) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(724293226, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsMainComposable (FareDetailsBaseComposable.kt:129)");
            }
            final MutableState mutableStateA = SubscribeAsStateKt.a(vm.t0(), composerStartRestartGroup);
            SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(softwareKeyboardController);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new yi(softwareKeyboardController, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SheetState sheetStateA = SheetDefaultsHelperKt.a(((FareDetailsViewState) mutableStateA.getValue()).n instanceof FareDetailsScreenType.ONDCTicket, (Function1) objRememberedValue2, SheetValue.Hidden, false, composerStartRestartGroup, 3456, 48);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue3;
            boolean zIsVisible = sheetStateA.isVisible();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changed(sheetStateA);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new a(1, sheetStateA, coroutineScope2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            BackHandlerKt.a(zIsVisible, (Function0) objRememberedValue4, 0, 0, composerStartRestartGroup, 2);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(vm) | composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changed(sheetStateA);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new FareDetailsBaseComposableKt$FareDetailsMainComposable$2$1(vm, coroutineScope2, sheetStateA, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(vm, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i2 & 14);
            ChaloThemeKt.a(null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1476908813, true, new Function2() { // from class: app.chalo.instantticket.ui.faredetails.compose.b
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    FareDetailsComponent fareDetailsComponent;
                    MutableState mutableState;
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer2.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1476908813, iIntValue, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsMainComposable.<anonymous> (FareDetailsBaseComposable.kt:178)");
                        }
                        final SheetState sheetState = sheetStateA;
                        boolean zIsVisible2 = sheetState.isVisible();
                        final FareDetailsComponent fareDetailsComponent2 = vm;
                        final MutableState mutableState2 = mutableStateA;
                        if (!zIsVisible2 || ((FareDetailsViewState) mutableState2.getValue()).s == null) {
                            fareDetailsComponent = fareDetailsComponent2;
                            mutableState = mutableState2;
                            composer2.startReplaceGroup(939112117);
                        } else {
                            composer2.startReplaceGroup(945705073);
                            FareDetailsBottomSheetType fareDetailsBottomSheetType = ((FareDetailsViewState) mutableState2.getValue()).s;
                            Shape shape = null;
                            if (fareDetailsBottomSheetType == null) {
                                composer2.startReplaceGroup(949923242);
                            } else {
                                composer2.startReplaceGroup(1970305335);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-95174125, 0, -1, "app.chalo.instantticket.ui.faredetails.compose.<get-sheetShape> (BottomSheetViews.kt:314)");
                                }
                                if ((fareDetailsBottomSheetType instanceof FareDetailsBottomSheetType.TncSection) || (fareDetailsBottomSheetType instanceof FareDetailsBottomSheetType.FareNoteSection)) {
                                    composer2.startReplaceGroup(-653802518);
                                    composer2.endReplaceGroup();
                                } else {
                                    if (!(fareDetailsBottomSheetType instanceof FareDetailsBottomSheetType.UserBillingDetails) && !(fareDetailsBottomSheetType instanceof FareDetailsBottomSheetType.FinalFare) && !(fareDetailsBottomSheetType instanceof FareDetailsBottomSheetType.FareBreakupAndFinalFare) && !(fareDetailsBottomSheetType instanceof FareDetailsBottomSheetType.FareValidationFailed)) {
                                        throw pk0.p(composer2, -1268019871);
                                    }
                                    composer2.startReplaceGroup(-1268008221);
                                    shape = ChaloTheme.d(composer2, 0).e;
                                    composer2.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                            composer2.endReplaceGroup();
                            if (shape == null) {
                                composer2.startReplaceGroup(1970306333);
                                shape = ChaloTheme.d(composer2, 0).e;
                            } else {
                                composer2.startReplaceGroup(1970304659);
                            }
                            composer2.endReplaceGroup();
                            long j = ChaloTheme.a(composer2, 0).t;
                            long j2 = ChaloTheme.a(composer2, 0).t;
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new wb(8);
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            final CoroutineScope coroutineScope3 = coroutineScope;
                            mutableState = mutableState2;
                            fareDetailsComponent = fareDetailsComponent2;
                            ModalBottomSheetKt.m2161ModalBottomSheetYbuCTN8((Function0) objRememberedValue6, null, sheetState, 0.0f, false, shape, j, j2, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1081375692, true, new Function3() { // from class: app.chalo.instantticket.ui.faredetails.compose.d
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    ColumnScope ModalBottomSheet = (ColumnScope) obj3;
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    Intrinsics.i(ModalBottomSheet, "$this$ModalBottomSheet");
                                    if (composer3.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1081375692, iIntValue2, -1, "app.chalo.instantticket.ui.faredetails.compose.FareDetailsMainComposable.<anonymous>.<anonymous> (FareDetailsBaseComposable.kt:181)");
                                        }
                                        MutableState mutableState3 = mutableState2;
                                        FareDetailsBottomSheetType fareDetailsBottomSheetType2 = ((FareDetailsViewState) mutableState3.getValue()).s;
                                        boolean z = fareDetailsBottomSheetType2 instanceof FareDetailsBottomSheetType.TncSection;
                                        SheetState sheetState2 = sheetState;
                                        if (z) {
                                            composer3.startReplaceGroup(1286584969);
                                            ChaloTncBottomSheetKt.a(((FareDetailsBottomSheetType.TncSection) fareDetailsBottomSheetType2).f3923a, sheetState2, composer3, 0);
                                            composer3.endReplaceGroup();
                                        } else if (fareDetailsBottomSheetType2 instanceof FareDetailsBottomSheetType.FareNoteSection) {
                                            composer3.startReplaceGroup(1286887529);
                                            String str = ((FareDetailsBottomSheetType.FareNoteSection) fareDetailsBottomSheetType2).f3922a;
                                            CoroutineScope coroutineScope4 = coroutineScope3;
                                            boolean zChangedInstance3 = composer3.changedInstance(coroutineScope4) | composer3.changed(sheetState2);
                                            Object objRememberedValue7 = composer3.rememberedValue();
                                            if (zChangedInstance3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue7 = new a(0, sheetState2, coroutineScope4);
                                                composer3.updateRememberedValue(objRememberedValue7);
                                            }
                                            BottomSheetViewsKt.d(0, composer3, null, str, (Function0) objRememberedValue7);
                                            composer3.endReplaceGroup();
                                        } else {
                                            boolean zD = Intrinsics.d(fareDetailsBottomSheetType2, FareDetailsBottomSheetType.UserBillingDetails.f3924a);
                                            FareDetailsComponent fareDetailsComponent3 = fareDetailsComponent2;
                                            if (zD) {
                                                composer3.startReplaceGroup(1287226142);
                                                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composer3, 0).h);
                                                UserBillingInfoBottomSheetState userBillingInfoBottomSheetState = ((FareDetailsViewState) mutableState3.getValue()).z;
                                                boolean zChangedInstance4 = composer3.changedInstance(fareDetailsComponent3);
                                                Object objRememberedValue8 = composer3.rememberedValue();
                                                if (zChangedInstance4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                                    FareDetailsBaseComposableKt$FareDetailsMainComposable$3$2$2$1 fareDetailsBaseComposableKt$FareDetailsMainComposable$3$2$2$1 = new FareDetailsBaseComposableKt$FareDetailsMainComposable$3$2$2$1(1, fareDetailsComponent3, FareDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;)V", 0);
                                                    composer3.updateRememberedValue(fareDetailsBaseComposableKt$FareDetailsMainComposable$3$2$2$1);
                                                    objRememberedValue8 = fareDetailsBaseComposableKt$FareDetailsMainComposable$3$2$2$1;
                                                }
                                                BottomSheetViewsKt.a(modifierM784padding3ABfNKs, userBillingInfoBottomSheetState, (Function1) ((KFunction) objRememberedValue8), composer3, 0);
                                                composer3.endReplaceGroup();
                                            } else if (fareDetailsBottomSheetType2 instanceof FareDetailsBottomSheetType.FinalFare) {
                                                composer3.startReplaceGroup(1287735348);
                                                Modifier modifierM784padding3ABfNKs2 = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.b(composer3, 0).h);
                                                String str2 = ((FareDetailsViewState) mutableState3.getValue()).i;
                                                boolean zIsEmpty = true ^ ((FareDetailsViewState) mutableState3.getValue()).p.isEmpty();
                                                boolean zChangedInstance5 = composer3.changedInstance(fareDetailsComponent3);
                                                Object objRememberedValue9 = composer3.rememberedValue();
                                                if (zChangedInstance5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue9 = new s20(fareDetailsComponent3, 0);
                                                    composer3.updateRememberedValue(objRememberedValue9);
                                                }
                                                Function0 function0 = (Function0) objRememberedValue9;
                                                boolean zChangedInstance6 = composer3.changedInstance(fareDetailsComponent3);
                                                Object objRememberedValue10 = composer3.rememberedValue();
                                                if (zChangedInstance6 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue10 = new s20(fareDetailsComponent3, 1);
                                                    composer3.updateRememberedValue(objRememberedValue10);
                                                }
                                                BottomSheetViewsKt.c(modifierM784padding3ABfNKs2, str2, zIsEmpty, function0, (Function0) objRememberedValue10, composer3, 0);
                                                composer3.endReplaceGroup();
                                            } else if (fareDetailsBottomSheetType2 instanceof FareDetailsBottomSheetType.FareBreakupAndFinalFare) {
                                                composer3.startReplaceGroup(1288676973);
                                                Modifier modifierM784padding3ABfNKs3 = PaddingKt.m784padding3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ChaloTheme.a(composer3, 0).t, null, 2, null), ChaloTheme.b(composer3, 0).h);
                                                OndcBookingUiModel ondcBookingUiModel = ((FareDetailsBottomSheetType.FareBreakupAndFinalFare) fareDetailsBottomSheetType2).f3921a;
                                                boolean zIsEmpty2 = true ^ ((FareDetailsViewState) mutableState3.getValue()).p.isEmpty();
                                                boolean zChangedInstance7 = composer3.changedInstance(fareDetailsComponent3);
                                                Object objRememberedValue11 = composer3.rememberedValue();
                                                if (zChangedInstance7 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue11 = new s20(fareDetailsComponent3, 2);
                                                    composer3.updateRememberedValue(objRememberedValue11);
                                                }
                                                Function0 function1 = (Function0) objRememberedValue11;
                                                boolean zChangedInstance8 = composer3.changedInstance(fareDetailsComponent3);
                                                Object objRememberedValue12 = composer3.rememberedValue();
                                                if (zChangedInstance8 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue12 = new s20(fareDetailsComponent3, 3);
                                                    composer3.updateRememberedValue(objRememberedValue12);
                                                }
                                                Function0 function2 = (Function0) objRememberedValue12;
                                                boolean zChangedInstance9 = composer3.changedInstance(fareDetailsComponent3);
                                                Object objRememberedValue13 = composer3.rememberedValue();
                                                if (zChangedInstance9 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue13 = new s20(fareDetailsComponent3, 4);
                                                    composer3.updateRememberedValue(objRememberedValue13);
                                                }
                                                BottomSheetViewsKt.b(modifierM784padding3ABfNKs3, ondcBookingUiModel, zIsEmpty2, function1, function2, (Function0) objRememberedValue13, composer3, 0);
                                                composer3.endReplaceGroup();
                                            } else {
                                                if (fareDetailsBottomSheetType2 != null) {
                                                    if (!(fareDetailsBottomSheetType2 instanceof FareDetailsBottomSheetType.FareValidationFailed)) {
                                                        throw pk0.p(composer3, 180050536);
                                                    }
                                                    composer3.startReplaceGroup(1290002502);
                                                    boolean zChangedInstance10 = composer3.changedInstance(fareDetailsComponent3);
                                                    Object objRememberedValue14 = composer3.rememberedValue();
                                                    if (zChangedInstance10 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue14 = new s20(fareDetailsComponent3, 5);
                                                        composer3.updateRememberedValue(objRememberedValue14);
                                                    }
                                                    Function0 function3 = (Function0) objRememberedValue14;
                                                    boolean zChangedInstance11 = composer3.changedInstance(fareDetailsComponent3);
                                                    Object objRememberedValue15 = composer3.rememberedValue();
                                                    if (zChangedInstance11 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue15 = new s20(fareDetailsComponent3, 6);
                                                        composer3.updateRememberedValue(objRememberedValue15);
                                                    }
                                                    FareDetailsBaseComposableKt.c(function3, (Function0) objRememberedValue15, composer3, 0);
                                                    throw null;
                                                }
                                                composer3.startReplaceGroup(1289791578);
                                                gf.r(Modifier.INSTANCE, ChaloTheme.b(composer3, 0).b, composer3, 0);
                                            }
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    } else {
                                        composer3.skipToGroupEnd();
                                    }
                                    return Unit.f17538a;
                                }
                            }, composer2, 54), composer2, 6, 3078, 6938);
                            composer2 = composer2;
                        }
                        composer2.endReplaceGroup();
                        FareDetailsViewState fareDetailsViewState = (FareDetailsViewState) mutableState.getValue();
                        boolean zChangedInstance3 = composer2.changedInstance(fareDetailsComponent);
                        Object objRememberedValue7 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            FareDetailsBaseComposableKt$FareDetailsMainComposable$3$3$1 fareDetailsBaseComposableKt$FareDetailsMainComposable$3$3$1 = new FareDetailsBaseComposableKt$FareDetailsMainComposable$3$3$1(1, fareDetailsComponent, FareDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;)V", 0);
                            composer2.updateRememberedValue(fareDetailsBaseComposableKt$FareDetailsMainComposable$3$3$1);
                            objRememberedValue7 = fareDetailsBaseComposableKt$FareDetailsMainComposable$3$3$1;
                        }
                        FareDetailsScreenKt.a(fareDetailsViewState, (Function1) ((KFunction) objRememberedValue7), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u20(vm, i, 0));
        }
    }

    public static final void c(Function0 onPayClick, Function0 onCancelClick, Composer composer, int i) {
        int i2;
        Function0 function0;
        int i3;
        Intrinsics.i(null, "message");
        Intrinsics.i(onPayClick, "onPayClick");
        Intrinsics.i(onCancelClick, "onCancelClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1267383145);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed((Object) null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPayClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCancelClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1267383145, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.FareValidationFailedBottomSheet (FareDetailsBaseComposable.kt:280)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i4), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            SpacerKt.Spacer(i41.a(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Painter painterA = PainterResourceHelperKt.a(IconType.IC_CLOSE, composerStartRestartGroup, 6);
            int i6 = i2 & 7168;
            boolean z = i6 == 2048;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new fk(onCancelClick, 21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i7 = i2;
            ImageKt.Image(painterA, "", ClickableKt.m299clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 120);
            composerStartRestartGroup.endNode();
            i3 = 0;
            TextKt.m2623TextNvy7gAk(null, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.a(TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.e(ChaloTheme.e(composerStartRestartGroup, 0)), 0L, TextUnitKt.getSp(24), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null)), composerStartRestartGroup, i7 & 14, 0, 131070);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            String strC = StringResourcesHelperKt.c(StringEnum.PAY_, new Object[]{0}, composerStartRestartGroup, 6);
            Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).n);
            Shape shape = ChaloTheme.d(composerStartRestartGroup, 0).g;
            boolean z2 = (i7 & 896) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new fk(onPayClick, 22);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            ChaloFilledButtonKt.g(modifierM814height3ABfNKs, strC, null, 0L, shape, false, 0.0f, null, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 492);
            ChaloSpacersKt.n(composerStartRestartGroup, 0);
            String strC2 = StringResourcesHelperKt.c(StringEnum.CANCEL, new Object[0], composerStartRestartGroup, 6);
            Modifier modifierM814height3ABfNKs2 = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).n);
            Shape shape2 = ChaloTheme.d(composerStartRestartGroup, 0).g;
            boolean z3 = i6 == 2048;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                function0 = onCancelClick;
                objRememberedValue3 = new fk(function0, 23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                function0 = onCancelClick;
            }
            ChaloFilledButtonKt.f(strC2, false, modifierM814height3ABfNKs2, null, shape2, 0.0f, 0L, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 106);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function0 = onCancelClick;
            i3 = 0;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t20(onPayClick, function0, i, i3));
        }
    }

    public static final void d(final FareDetailsComponent vm, final InstantTicketWalletAccessComponent instantTicketWalletAccessComponent, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.i(vm, "vm");
        Intrinsics.i(instantTicketWalletAccessComponent, "instantTicketWalletAccessComponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(485862798);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(vm) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(instantTicketWalletAccessComponent) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(485862798, i2, -1, "app.chalo.instantticket.ui.faredetails.compose.InstantTicketFareDetailsMainComposable (FareDetailsBaseComposable.kt:74)");
            }
            final MutableState mutableStateA = SubscribeAsStateKt.a(vm.t0(), composerStartRestartGroup);
            final MutableState mutableStateA2 = SubscribeAsStateKt.a(instantTicketWalletAccessComponent.E, composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            final SheetState sheetStateRememberStandardBottomSheetState = BottomSheetScaffoldKt.rememberStandardBottomSheetState(SheetValue.Hidden, null, false, composerStartRestartGroup, 390, 2);
            boolean zIsVisible = sheetStateRememberStandardBottomSheetState.isVisible();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberStandardBottomSheetState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new a(2, sheetStateRememberStandardBottomSheetState, coroutineScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            BackHandlerKt.a(zIsVisible, (Function0) objRememberedValue2, 0, 0, composerStartRestartGroup, 2);
            boolean zChanged = composerStartRestartGroup.changed(sheetStateRememberStandardBottomSheetState) | composerStartRestartGroup.changedInstance(vm);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new FareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$2$1(sheetStateRememberStandardBottomSheetState, vm, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(sheetStateRememberStandardBottomSheetState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            SetupInstantTicketFareDetailsSideEffectKt.a(vm, composerStartRestartGroup, i2 & 14);
            InstantTicketWalletAccessSideEffectSetupKt.a(sheetStateRememberStandardBottomSheetState, instantTicketWalletAccessComponent, composerStartRestartGroup, (i2 & 112) | 384);
            ChaloThemeKt.a(null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1450097713, true, new Function2() { // from class: app.chalo.instantticket.ui.faredetails.compose.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer3 = (Composer) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (composer3.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1450097713, iIntValue, -1, "app.chalo.instantticket.ui.faredetails.compose.InstantTicketFareDetailsMainComposable.<anonymous> (FareDetailsBaseComposable.kt:115)");
                        }
                        FareDetailsViewState fareDetailsViewState = (FareDetailsViewState) mutableStateA.getValue();
                        InstantTicketWalletAccessState instantTicketWalletAccessState = (InstantTicketWalletAccessState) mutableStateA2.getValue();
                        InstantTicketWalletAccessComponent instantTicketWalletAccessComponent2 = instantTicketWalletAccessComponent;
                        boolean zChangedInstance2 = composer3.changedInstance(instantTicketWalletAccessComponent2);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            FareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$3$1$1 fareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$3$1$1 = new FareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$3$1$1(1, instantTicketWalletAccessComponent2, InstantTicketWalletAccessComponent.class, "sendIntent", "sendIntent(Lapp/chalo/instantticket/ui/instantticketscreen/InstantTicketWalletAccessIntent;)V", 0);
                            composer3.updateRememberedValue(fareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$3$1$1);
                            objRememberedValue4 = fareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$3$1$1;
                        }
                        Function1 function1 = (Function1) ((KFunction) objRememberedValue4);
                        FareDetailsComponent fareDetailsComponent = vm;
                        boolean zChangedInstance3 = composer3.changedInstance(fareDetailsComponent);
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            FareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$3$2$1 fareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$3$2$1 = new FareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$3$2$1(1, fareDetailsComponent, FareDetailsComponent.class, "processIntent", "processIntent(Lapp/chalo/instantticket/ui/faredetails/contract/FareDetailsIntent;)V", 0);
                            composer3.updateRememberedValue(fareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$3$2$1);
                            objRememberedValue5 = fareDetailsBaseComposableKt$InstantTicketFareDetailsMainComposable$3$2$1;
                        }
                        InstantTicketFareDetailsMainScreenKt.a(sheetStateRememberStandardBottomSheetState, fareDetailsViewState, instantTicketWalletAccessState, function1, (Function1) ((KFunction) objRememberedValue5), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return Unit.f17538a;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572864);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new r20(vm, instantTicketWalletAccessComponent, i, 2));
        }
    }
}
