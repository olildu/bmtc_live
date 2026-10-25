package app.chalo.home.ui.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
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
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.TextUnitKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.components.textfields.ChaloTextFieldKt;
import app.chalo.compose.resources.LottieResourceHelperKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.home.ui.base.RideHailingUserFeedbackData;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.ridehailing.common.RideHailingUIStateCommonFactory;
import app.chalo.ridehailing.feedback.RatingReaction;
import app.chalo.ridehailing.feedback.UserFeedbackRatingData;
import app.chalo.ridehailing.feedback.UserFeedbackReasonData;
import defpackage.fu0;
import defpackage.h0;
import defpackage.o01;
import defpackage.p01;
import defpackage.pk0;
import defpackage.r1;
import defpackage.xc;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "commentTextValue", "home_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RideHailingUserFeedbackBottomSheetContentKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(RideHailingUserFeedbackData feedbackData, Function2 onDataChange, Function1 onCommentChange, Function0 onSubmitClick, Function0 function0, Composer composer, int i) {
        Composer composer2;
        Object next;
        UserFeedbackReasonData userFeedbackReasonData;
        Composer composer3;
        Composer composer4;
        int i2;
        Composer composer5;
        long j;
        ?? r6;
        long j2;
        float f;
        int i3;
        Object next2;
        Function0 onSkipClick = function0;
        Intrinsics.i(feedbackData, "feedbackData");
        List list = feedbackData.b;
        Intrinsics.i(onDataChange, "onDataChange");
        Intrinsics.i(onCommentChange, "onCommentChange");
        Intrinsics.i(onSubmitClick, "onSubmitClick");
        Intrinsics.i(onSkipClick, "onSkipClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1784461747);
        int i4 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(feedbackData) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onDataChange) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onCommentChange) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSubmitClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSkipClick) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1784461747, i4, -1, "app.chalo.home.ui.common.RideHailingUserFeedbackBottomSheetContent (RideHailingUserFeedbackBottomSheetContent.kt:58)");
            }
            List<UserFeedbackRatingData> list2 = list;
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((UserFeedbackRatingData) next).c);
            UserFeedbackRatingData userFeedbackRatingData = (UserFeedbackRatingData) next;
            if (userFeedbackRatingData != null) {
                Iterator it2 = userFeedbackRatingData.d.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!((UserFeedbackReasonData) next2).c);
                userFeedbackReasonData = (UserFeedbackReasonData) next2;
            } else {
                userFeedbackReasonData = null;
            }
            String str = feedbackData.c;
            if (str == null) {
                str = "";
            }
            boolean zChanged = composerStartRestartGroup.changed(str);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i5), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            UserFeedbackReasonData userFeedbackReasonData2 = userFeedbackReasonData;
            int i6 = 0;
            int i7 = i4;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.RIDE_HAILING_BOTTOMSHEET_FEEDBACK_HEADER, new Object[0], composerStartRestartGroup, 6), null, 0L, null, TextUnitKt.getSp(24), null, FontWeight.INSTANCE.getBold(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 1597440, 0, 262062);
            Composer composer6 = composerStartRestartGroup;
            ChaloSpacersKt.a(ChaloTheme.b(composer6, 0).k, composer6, 0);
            float f2 = 0.0f;
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(companion, ChaloTheme.b(composer6, 0).f, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer6, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
            int i8 = 32;
            int i9 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composer6.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer6, modifierM786paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer6.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor2);
            } else {
                composer6.useNode();
            }
            Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer6);
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i9), composerM3915constructorimpl2));
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getTop(), composer6, 6);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
            int i10 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composer6.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer6, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer6.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor3);
            } else {
                composer6.useNode();
            }
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composer6);
            pk0.v(companion3, composerM3915constructorimpl3, measurePolicyRowMeasurePolicy, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl3, Integer.valueOf(i10), composerM3915constructorimpl3));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer6.startReplaceGroup(18920636);
            for (UserFeedbackRatingData userFeedbackRatingData2 : list2) {
                Modifier.Companion companion4 = Modifier.INSTANCE;
                MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer6);
                int i11 = ((i7 & 112) == i8 ? 1 : i6) | (composer6.changedInstance(userFeedbackRatingData2) ? 1 : 0);
                Object objRememberedValue2 = composer6.rememberedValue();
                if (i11 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new p01(14, onDataChange, userFeedbackRatingData2);
                    composer6.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(companion4, mutableInteractionSourceB, null, false, null, null, (Function0) objRememberedValue2, 28, null);
                float f3 = ChaloThemeHelper.a().b;
                RoundedCornerShape circleShape = RoundedCornerShapeKt.getCircleShape();
                boolean z = userFeedbackRatingData2.c;
                RatingReaction ratingReaction = userFeedbackRatingData2.b;
                if (z) {
                    composer6.startReplaceGroup(-1297993914);
                    j = ChaloTheme.a(composer6, i6).f1915a;
                    composer6.endReplaceGroup();
                } else {
                    composer6.startReplaceGroup(-1297990588);
                    j = ChaloTheme.a(composer6, 0).Z;
                    composer6.endReplaceGroup();
                }
                Modifier modifierM275borderxT4_qwU = BorderKt.m275borderxT4_qwU(modifierM295clickableO2vRcR0$default, f3, j, circleShape);
                if (z) {
                    composer6.startReplaceGroup(-1297984351);
                    r6 = 0;
                    j2 = ChaloTheme.a(composer6, 0).N0;
                    composer6.endReplaceGroup();
                } else {
                    r6 = 0;
                    composer6.startReplaceGroup(-1297981182);
                    j2 = ChaloTheme.a(composer6, 0).m0;
                    composer6.endReplaceGroup();
                }
                Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(BackgroundKt.m263backgroundbw27NRU(modifierM275borderxT4_qwU, j2, RoundedCornerShapeKt.getCircleShape()), ChaloTheme.b(composer6, r6).d);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), r6);
                long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, r6);
                int i12 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> i8));
                CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer6, modifierM784padding3ABfNKs);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                if (composer6.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer6.startReusableNode();
                if (composer6.getInserting()) {
                    composer6.createNode(constructor4);
                } else {
                    composer6.useNode();
                }
                Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composer6);
                pk0.v(companion5, composerM3915constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl4, currentCompositionLocalMap4);
                Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i12), composerM3915constructorimpl4));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (z) {
                    composer6.startReplaceGroup(866640752);
                    f = f2;
                    i3 = i8;
                    ImageKt.Image(LottieResourceHelperKt.c(LottieResourceHelperKt.b(RideHailingUIStateCommonFactory.Companion.b(ratingReaction), composer6, 0), 1, false, composer6, 48, 28), (String) null, SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composer6, 0).m), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer6, Painter.$stable | 48, 120);
                    composer6.endReplaceGroup();
                } else {
                    f = f2;
                    i3 = i8;
                    composer6.startReplaceGroup(867114742);
                    ImageKt.Image(PainterResourceHelperKt.a(RideHailingUIStateCommonFactory.Companion.a(ratingReaction), composer6, 0), (String) null, SizeKt.m828size3ABfNKs(companion4, ChaloTheme.b(composer6, 0).m), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer6, Painter.$stable | 48, 120);
                    composer6.endReplaceGroup();
                }
                composer6.endNode();
                f2 = f;
                i8 = i3;
                i6 = 0;
            }
            int i13 = i8;
            float f4 = f2;
            composer6.endReplaceGroup();
            composer6.endNode();
            composer6.endNode();
            if (userFeedbackRatingData == null) {
                composer6.startReplaceGroup(909220748);
                composer6.endReplaceGroup();
                userFeedbackRatingData = userFeedbackRatingData;
                composer4 = composer6;
            } else {
                composer6.startReplaceGroup(909220749);
                ChaloSpacersKt.a(ChaloTheme.b(composer6, 0).k, composer6, 0);
                Modifier.Companion companion6 = Modifier.INSTANCE;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement2.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
                long currentCompositeKeyHashCode5 = ComposablesKt.getCurrentCompositeKeyHashCode(composer6, 0);
                int i14 = (int) (currentCompositeKeyHashCode5 ^ (currentCompositeKeyHashCode5 >>> i13));
                CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer6, companion6);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion7.getConstructor();
                if (composer6.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer6.startReusableNode();
                if (composer6.getInserting()) {
                    composer6.createNode(constructor5);
                } else {
                    composer6.useNode();
                }
                Composer composerM3915constructorimpl5 = Updater.m3915constructorimpl(composer6);
                pk0.v(companion7, composerM3915constructorimpl5, measurePolicyColumnMeasurePolicy3, composerM3915constructorimpl5, currentCompositionLocalMap5);
                Updater.m3923setimpl(composerM3915constructorimpl5, modifierMaterializeModifier5, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion7, composerM3915constructorimpl5, Integer.valueOf(i14), composerM3915constructorimpl5));
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                TextKt.m2623TextNvy7gAk(userFeedbackRatingData.f9173a, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTheme.e(composer6, 0).getHeadlineSmall(), composer6, 0, 0, 131070);
                Composer composer7 = composer6;
                ChaloSpacersKt.a(ChaloTheme.b(composer7, 0).h, composer7, 0);
                FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(companion6, f4, 1, null), arrangement2.m672spacedBy0680j_4(ChaloTheme.b(composer7, 0).g), arrangement2.m672spacedBy0680j_4(ChaloTheme.b(composer7, 0).h), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-319919466, true, new fu0(16, userFeedbackRatingData, onDataChange), composer7, 54), composer7, 1572870, 56);
                if (userFeedbackReasonData2 == null || !userFeedbackReasonData2.d) {
                    composer7.startReplaceGroup(-1788272409);
                    composer3 = composer7;
                } else {
                    composer7.startReplaceGroup(-1779515591);
                    ChaloSpacersKt.a(ChaloTheme.b(composer7, 0).i, composer7, 0);
                    Modifier modifierM816heightInVpY3zN4$default = SizeKt.m816heightInVpY3zN4$default(PaddingKt.m784padding3ABfNKs(BorderKt.m275borderxT4_qwU(SizeKt.fillMaxWidth$default(companion6, f4, 1, null), ChaloTheme.b(composer7, 0).b, ChaloTheme.a(composer7, 0).v0, ChaloTheme.d(composer7, 0).g), ChaloTheme.b(composer7, 0).f), ChaloTheme.b(composer7, 0).s, f4, 2, null);
                    TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
                    MutableInteractionSource mutableInteractionSourceB2 = RippleEffectKt.b(composer7);
                    TextStyle bodyMedium = ChaloTheme.e(composer7, 0).getBodyMedium();
                    Shape shape = ChaloTheme.d(composer7, 0).g;
                    TextFieldColors textFieldColorsM2603colors0hiis_0 = TextFieldDefaults.INSTANCE.m2603colors0hiis_0(0L, 0L, 0L, 0L, ChaloTheme.a(composer7, 0).t, ChaloTheme.a(composer7, 0).t, ChaloTheme.a(composer7, 0).t, ChaloTheme.a(composer7, 0).t, ChaloTheme.a(composer7, 0).f1915a, 0L, null, ChaloTheme.a(composer7, 0).t, ChaloTheme.a(composer7, 0).t, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer7, 0, 0, 0, 0, 3072, 2147477007, 4095);
                    boolean zChanged2 = composer7.changed(mutableState) | ((i7 & 896) == 256);
                    Object objRememberedValue3 = composer7.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new xc(onCommentChange, mutableState, 7);
                        composer7.updateRememberedValue(objRememberedValue3);
                    }
                    ChaloTextFieldKt.a(textFieldValue, (Function1) objRememberedValue3, modifierM816heightInVpY3zN4$default, false, false, bodyMedium, null, ComposableSingletons$RideHailingUserFeedbackBottomSheetContentKt.f3378a, null, null, false, null, null, null, false, 4, mutableInteractionSourceB2, shape, textFieldColorsM2603colors0hiis_0, null, composer7, 12582912, 221184, 540504);
                    composer3 = composer7;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                composer3.endReplaceGroup();
                composer4 = composer3;
            }
            ChaloSpacersKt.a(ChaloTheme.b(composer4, 0).k, composer4, 0);
            Modifier.Companion companion8 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
            long currentCompositeKeyHashCode6 = ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0);
            int i15 = (int) (currentCompositeKeyHashCode6 ^ (currentCompositeKeyHashCode6 >>> i13));
            CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer4, companion8);
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor6 = companion9.getConstructor();
            if (composer4.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor6);
            } else {
                composer4.useNode();
            }
            Composer composerM3915constructorimpl6 = Updater.m3915constructorimpl(composer4);
            pk0.v(companion9, composerM3915constructorimpl6, measurePolicyColumnMeasurePolicy4, composerM3915constructorimpl6, currentCompositionLocalMap6);
            Updater.m3923setimpl(composerM3915constructorimpl6, modifierMaterializeModifier6, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion9, composerM3915constructorimpl6, Integer.valueOf(i15), composerM3915constructorimpl6));
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            if (userFeedbackRatingData == null) {
                composer4.startReplaceGroup(-1941295313);
                composer4.endReplaceGroup();
                i2 = 0;
                composer5 = composer4;
            } else {
                composer4.startReplaceGroup(-1941295312);
                Modifier modifierM814height3ABfNKs = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), ChaloTheme.b(composer4, 0).n);
                Shape shape2 = ChaloTheme.d(composer4, 0).g;
                String strC = StringResourcesHelperKt.c(StringEnum.SUBMIT_SMALL, new Object[0], composer4, 6);
                boolean z2 = (i7 & 7168) == 2048;
                Object objRememberedValue4 = composer4.rememberedValue();
                if (z2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new o01(onSubmitClick, 7);
                    composer4.updateRememberedValue(objRememberedValue4);
                }
                Composer composer8 = composer4;
                ChaloFilledButtonKt.g(modifierM814height3ABfNKs, strC, null, 0L, shape2, false, 0.0f, null, 0L, (Function0) objRememberedValue4, composer8, 0, 492);
                Composer composer9 = composer8;
                i2 = 0;
                ChaloSpacersKt.a(ChaloTheme.b(composer9, 0).g, composer9, 0);
                composer9.endReplaceGroup();
                composer5 = composer9;
            }
            Modifier modifierM814height3ABfNKs2 = SizeKt.m814height3ABfNKs(SizeKt.fillMaxWidth$default(companion8, 0.0f, 1, null), ChaloTheme.b(composer5, i2).n);
            Shape shape3 = ChaloTheme.d(composer5, i2).g;
            String strC2 = StringResourcesHelperKt.c(StringEnum.SKIP, new Object[i2], composer5, 6);
            if ((i7 & 57344) == 16384) {
                i2 = 1;
            }
            Object objRememberedValue5 = composer5.rememberedValue();
            if (i2 != 0 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                onSkipClick = function0;
                objRememberedValue5 = new o01(onSkipClick, 6);
                composer5.updateRememberedValue(objRememberedValue5);
            } else {
                onSkipClick = function0;
            }
            Composer composer10 = composer5;
            ChaloFilledButtonKt.f(strC2, false, modifierM814height3ABfNKs2, null, shape3, 0.0f, 0L, (Function0) objRememberedValue5, composer10, 0, 106);
            Composer composer11 = composer10;
            boolean zK = r1.k(composer11);
            composer2 = composer11;
            if (zK) {
                ComposerKt.traceEventEnd();
                composer2 = composer11;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h0(feedbackData, onDataChange, onCommentChange, onSubmitClick, onSkipClick, i, 28));
        }
    }
}
