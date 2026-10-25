package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import app.chalo.compose.ChaloToolBarKt;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.components.ChaloSearchBarComposableKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.GenericErrorScreenComponentKt;
import app.chalo.compose.components.RippleEffectKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchResultType;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchItem;
import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchPlacesAndStopsInfoModel;
import app.chalo.livetracking.universalsearch.ui.SearchErrorScreen;
import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.bp;
import defpackage.g0;
import defpackage.gb;
import defpackage.gp;
import defpackage.hp;
import defpackage.i41;
import defpackage.ip;
import defpackage.jp;
import defpackage.kp;
import defpackage.l9;
import defpackage.lp;
import defpackage.mp;
import defpackage.op;
import defpackage.pk0;
import defpackage.pp;
import defpackage.r1;
import defpackage.s4;
import defpackage.u;
import defpackage.xc;
import defpackage.zc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldState", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CitySelectionUniversalPickerScreenKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5090a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SearchScreenLayoutType.values().length];
            try {
                iArr[SearchScreenLayoutType.REMOTE_SEARCHED_ITEM_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchScreenLayoutType.RECENT_AND_FAVORITE_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchScreenLayoutType.RECENT_RESULT_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchScreenLayoutType.ERROR_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f5090a = iArr;
            int[] iArr2 = new int[UniversalSearchResultType.values().length];
            try {
                iArr2[UniversalSearchResultType.PLACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UniversalSearchResultType.STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[UniversalSearchResultType.ROUTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[UniversalSearchResultType.TRIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
        }
    }

    public static final void a(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(117664413);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(117664413, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.CityRecentItemHeader (CitySelectionUniversalPickerScreen.kt:329)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
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
            pk0.v(companion, composerM3915constructorimpl, measurePolicyRowMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.RECENT_SEARCHES, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.g(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131066);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.x(composerStartRestartGroup, 0);
            BoxKt.Box(BackgroundKt.background$default(i41.a(rowScopeInstance, SizeKt.m814height3ABfNKs(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).b), 1.0f, false, 2, null), Brush.Companion.m4558horizontalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.S(Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).o0), Color.m4595boximpl(ChaloTheme.a(composerStartRestartGroup, 0).p0)), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 6));
        }
    }

    public static final void b(Modifier modifier, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1212597535);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1212597535, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.CitySearchNoResultFoundComposable (CitySelectionUniversalPickerScreen.kt:270)");
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
            ImageKt.Image(PainterResourceHelperKt.a(IconType.CITY_SEARCH_NO_RESULT, composerStartRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | 48, 124);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.UNIVERSAL_CITY_SEARCH_NO_RESULT_FOUND_DESCRIPTION, new Object[0], composerStartRestartGroup, 6), null, ChaloTheme.a(composerStartRestartGroup, 0).v0, null, 0L, null, null, null, 0L, null, TextAlign.m7161boximpl(TextAlign.INSTANCE.m7168getCentere0LSkKk()), 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composer2, 0, 0, 130042);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new zc(modifier, i, 5));
        }
    }

    public static final void c(UniversalSearchItem.PlacesAndStopsItem placesAndStopsItem, Function1 function1, TextFieldValue textFieldValue, Composer composer, int i) {
        int i2;
        boolean z;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-857832862);
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(placesAndStopsItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i5 = 32;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldValue) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-857832862, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.CitySearchPlaceSearchItemComposable (CitySelectionUniversalPickerScreen.kt:210)");
            }
            ArrayList arrayList = placesAndStopsItem.f5001a;
            if (arrayList.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-651051776);
            } else {
                composerStartRestartGroup.startReplaceGroup(-643130997);
                ChaloDividerComposableKt.b(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null), ChaloTheme.a(composerStartRestartGroup, 0).e, composerStartRestartGroup, 0, 0);
                int size = arrayList.size();
                int i6 = 0;
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    int i8 = i7 + 1;
                    int i9 = i6 + 1;
                    if (i6 < 0) {
                        composerStartRestartGroup = composerStartRestartGroup;
                        CollectionsKt.z0();
                        throw null;
                    }
                    UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel = (UniversalSearchPlacesAndStopsInfoModel) obj;
                    int i10 = WhenMappings.b[universalSearchPlacesAndStopsInfoModel.f5003a.ordinal()];
                    if (i10 == 1) {
                        composerStartRestartGroup.startReplaceGroup(-1541100669);
                        int i11 = size;
                        String text = textFieldValue.getText();
                        String str = universalSearchPlacesAndStopsInfoModel.b;
                        if ((i2 & 112) == i5) {
                            composerStartRestartGroup = composerStartRestartGroup;
                            z = true;
                        } else {
                            composerStartRestartGroup = composerStartRestartGroup;
                            z = false;
                        }
                        boolean zChangedInstance = z | composerStartRestartGroup.changedInstance(universalSearchPlacesAndStopsInfoModel) | composerStartRestartGroup.changed(i6);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new gp(function1, universalSearchPlacesAndStopsInfoModel, i6, 0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        int i12 = i6;
                        i3 = i11;
                        Composer composer2 = composerStartRestartGroup;
                        SetUpUniversalItemListKt.a(text, str, false, (Function0) objRememberedValue, composer2, 384);
                        composerStartRestartGroup = composer2;
                        if (i12 < CollectionsKt.K(arrayList)) {
                            composerStartRestartGroup.startReplaceGroup(-1540632259);
                            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
                            long j = ChaloTheme.a(composerStartRestartGroup, 0).e;
                            composerStartRestartGroup = composerStartRestartGroup;
                            ChaloDividerComposableKt.b(modifierM786paddingVpY3zN4$default, j, composerStartRestartGroup, 0, 0);
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1549341616);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i10 != 2 && i10 != 3 && i10 != i4) {
                            throw pk0.p(composerStartRestartGroup, -188262696);
                        }
                        composerStartRestartGroup.startReplaceGroup(-1540202258);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 = size;
                    }
                    size = i3;
                    i7 = i8;
                    i6 = i9;
                    i4 = 4;
                    i5 = 32;
                }
                composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new s4(i, 29, placesAndStopsItem, function1, textFieldValue));
        }
    }

    public static final void d(Modifier modifier, UniversalPickerViewState universalPickerViewState, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(660544863);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(universalPickerViewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(660544863, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.CitySearchRecentSearchedResultsComposable (CitySelectionUniversalPickerScreen.kt:297)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(universalPickerViewState) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jp(universalPickerViewState, function1, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifier2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, i2 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kp(modifier, universalPickerViewState, function1, i, 0));
        }
    }

    public static final void e(UniversalPickerViewState universalPickerViewState, Function1 function1, TextFieldValue textFieldValue, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1724670690);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(universalPickerViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldValue) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1724670690, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.CitySearchScreenErrorComposable (CitySelectionUniversalPickerScreen.kt:251)");
            }
            SearchErrorScreen searchErrorScreen = universalPickerViewState.g;
            if (searchErrorScreen instanceof SearchErrorScreen.ApiErrorOccurred) {
                composerStartRestartGroup.startReplaceGroup(-448834922);
                Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(Modifier.INSTANCE, 0.7f);
                boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new lp(function1, textFieldValue, 0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                GenericErrorScreenComponentKt.a(modifierFillMaxHeight, null, false, (Function0) objRememberedValue, composerStartRestartGroup, 6, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(searchErrorScreen instanceof SearchErrorScreen.NoResultFound)) {
                    throw pk0.p(composerStartRestartGroup, -448837257);
                }
                composerStartRestartGroup.startReplaceGroup(-448825731);
                b(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new mp(universalPickerViewState, function1, textFieldValue, i, 0));
        }
    }

    public static final void f(Modifier modifier, UniversalPickerViewState viewState, TextFieldValue textFieldState, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(textFieldState, "textFieldState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-350975885);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350975885, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.CitySearchUniversalSearchLayout (CitySelectionUniversalPickerScreen.kt:147)");
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
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
            int i4 = WhenMappings.f5090a[viewState.f.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(-1919592933);
                h(viewState.b, textFieldState, sendIntent, composerStartRestartGroup, (i2 >> 3) & 1008);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 == 2) {
                composerStartRestartGroup.startReplaceGroup(622441091);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 == 3) {
                composerStartRestartGroup.startReplaceGroup(-1919581176);
                d(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), viewState, sendIntent, composerStartRestartGroup, ((i2 >> 3) & 896) | (i2 & 112) | 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 4) {
                    throw pk0.p(composerStartRestartGroup, -1919595787);
                }
                composerStartRestartGroup.startReplaceGroup(-1919572485);
                e(viewState, sendIntent, textFieldState, composerStartRestartGroup, ((i2 >> 3) & 14) | ((i2 >> 6) & 112) | (i2 & 896));
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ip(modifier, viewState, textFieldState, sendIntent, i, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(UniversalPickerViewState viewState, FocusRequester focusRequester, Function1 sendIntent, Composer composer, int i) {
        int i2;
        boolean z;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(focusRequester, "focusRequester");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1124861370);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1124861370, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreen (CitySelectionUniversalPickerScreen.kt:69)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM264backgroundbw27NRU$default = BackgroundKt.m264backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ChaloTheme.a(composerStartRestartGroup, 0).t, null, 2, null);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new op(focusRequester, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierM264backgroundbw27NRU$default, (Function1) objRememberedValue);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i4 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
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
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            if (viewState.j) {
                mutableState.setValue(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
            }
            ChaloToolBarKt.g(PaddingKt.m784padding3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).h), StringResourcesHelperKt.c(StringEnum.SEARCH_LOCATION, new Object[0], composerStartRestartGroup, 6), 0L, null, composerStartRestartGroup, 0, 12);
            ChaloSpacersKt.m(composerStartRestartGroup, 0);
            Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i5 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM786paddingVpY3zN4$default);
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
            pk0.v(companion3, composerM3915constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM3915constructorimpl2, currentCompositionLocalMap2);
            Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl2, Integer.valueOf(i5), composerM3915constructorimpl2));
            Modifier modifierM788paddingqDBjuR0$default = PaddingKt.m788paddingqDBjuR0$default(BorderKt.m275borderxT4_qwU(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).b, ChaloTheme.a(composerStartRestartGroup, 0).B, ChaloTheme.d(composerStartRestartGroup, 0).c), ChaloTheme.b(composerStartRestartGroup, 0).h, 0.0f, 0.0f, 0.0f, 14, null);
            TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
            int i6 = i2 & 896;
            boolean z3 = i6 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == companion4.getEmpty()) {
                z = true;
                objRememberedValue3 = new xc(sendIntent, mutableState, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                z = true;
            }
            Function1 function1 = (Function1) objRememberedValue3;
            boolean z4 = i6 == 256 ? z : false;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new bp(sendIntent, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            int i7 = i2;
            i(modifierM788paddingqDBjuR0$default, focusRequester, textFieldValue, viewState, null, function1, (Function0) objRememberedValue4, composerStartRestartGroup, i3 | ((i2 << 9) & 7168), 16);
            composerStartRestartGroup = composerStartRestartGroup;
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            boolean z5 = i6 == 256;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue5 == companion4.getEmpty()) {
                objRememberedValue5 = new bp(sendIntent, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            j(0, composerStartRestartGroup, null, (Function0) objRememberedValue5);
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            boolean z6 = i6 == 256;
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (z6 || objRememberedValue6 == companion4.getEmpty()) {
                objRememberedValue6 = new bp(sendIntent, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            k(0, composerStartRestartGroup, null, (Function0) objRememberedValue6);
            composerStartRestartGroup.endNode();
            ChaloSpacersKt.p(composerStartRestartGroup, 0);
            int i8 = i7 << 3;
            f(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), viewState, (TextFieldValue) mutableState.getValue(), sendIntent, composerStartRestartGroup, (i8 & 112) | 6 | (i8 & 7168));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pp(viewState, focusRequester, sendIntent, i, 0));
        }
    }

    public static final void h(final List list, final TextFieldValue textFieldValue, final Function1 function1, Composer composer, final int i) {
        int i2;
        TextFieldValue textFieldValue2;
        Function1 function2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1465996462);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1465996462, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.CityUniversalSearchListComposable (CitySelectionUniversalPickerScreen.kt:181)");
            }
            if (list.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-2021615588);
                NoResultFoundComposableKt.a(0, 3, composerStartRestartGroup, null, null);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final int i3 = 0;
                function3 = new Function2() { // from class: np
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i3;
                        Composer composer2 = (Composer) obj;
                        ((Integer) obj2).intValue();
                        switch (i4) {
                            case 0:
                                CitySelectionUniversalPickerScreenKt.h(list, textFieldValue, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                            default:
                                CitySelectionUniversalPickerScreenKt.h(list, textFieldValue, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                                break;
                        }
                        return Unit.f17538a;
                    }
                };
            } else {
                textFieldValue2 = textFieldValue;
                function2 = function1;
                composerStartRestartGroup.startReplaceGroup(-2028685324);
                composerStartRestartGroup.endReplaceGroup();
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new u(18, list, function2, textFieldValue2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, FrameMetricsAggregator.EVERY_DURATION);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup.updateScope(function3);
        }
        textFieldValue2 = textFieldValue;
        function2 = function1;
        composerStartRestartGroup.skipToGroupEnd();
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final int i4 = 1;
            final TextFieldValue textFieldValue3 = textFieldValue2;
            final Function1 function4 = function2;
            function3 = new Function2() { // from class: np
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = i4;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i5) {
                        case 0:
                            CitySelectionUniversalPickerScreenKt.h(list, textFieldValue3, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                        default:
                            CitySelectionUniversalPickerScreenKt.h(list, textFieldValue3, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.f17538a;
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:104:0x0314  */
    /* JADX WARN: Code duplicated, block: B:76:0x018c  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:88:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0226  */
    /* JADX WARN: Code duplicated, block: B:92:0x022a  */
    /* JADX WARN: Code duplicated, block: B:95:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:96:0x02bf  */
    public static final void i(Modifier modifier, FocusRequester focusRequester, TextFieldValue textFieldState, UniversalPickerViewState viewState, TextFieldColors textFieldColors, Function1 onValueChange, Function0 onClearIconClick, Composer composer, int i, int i2) {
        int i3;
        TextFieldColors textFieldColors2;
        Composer composer2;
        TextFieldColors textFieldColors3;
        TextFieldColors textFieldColors4;
        int i4;
        Function0<ComposeUiNode> constructor;
        Function0<ComposeUiNode> constructor2;
        boolean z;
        Object objRememberedValue;
        Intrinsics.i(focusRequester, "focusRequester");
        Intrinsics.i(textFieldState, "textFieldState");
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(onValueChange, "onValueChange");
        Intrinsics.i(onClearIconClick, "onClearIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(511518099);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(textFieldState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                textFieldColors2 = textFieldColors;
                int i5 = composerStartRestartGroup.changed(textFieldColors2) ? 16384 : 8192;
                i3 |= i5;
            } else {
                textFieldColors2 = textFieldColors;
            }
            i3 |= i5;
        } else {
            textFieldColors2 = textFieldColors;
        }
        if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClearIconClick) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    TextFieldColors textFieldColorsM2603colors0hiis_0 = TextFieldDefaults.INSTANCE.m2603colors0hiis_0(0L, 0L, 0L, 0L, ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).f1915a, 0L, null, ChaloTheme.a(composerStartRestartGroup, 0).t, ChaloTheme.a(composerStartRestartGroup, 0).t, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, 3072, 2147477007, 4095);
                    composerStartRestartGroup = composerStartRestartGroup;
                    textFieldColors4 = textFieldColorsM2603colors0hiis_0;
                    i4 = i3 & (-57345);
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(511518099, i4, -1, "app.chalo.livetracking.universalsearch.ui.compose.SearchTextField (CitySelectionUniversalPickerScreen.kt:443)");
                }
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i6 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i6), composerM3915constructorimpl));
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
                int i7 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                constructor2 = companion2.getConstructor();
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
                pk0.v(companion2, composerM3915constructorimpl2, measurePolicyRowMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl2, Integer.valueOf(i7), composerM3915constructorimpl2));
                Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(i41.a(RowScopeInstance.INSTANCE, companion3, 1.0f, false, 2, null), focusRequester);
                String str = viewState.c;
                TextStyle textStyleM6753copyp1EtxEg$default = TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), ChaloTheme.a(composerStartRestartGroup, 0).v0, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6981getTextPjHm6EE(), ImeAction.INSTANCE.m6921getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
                if ((458752 & i4) == 131072) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new g0(onValueChange, 29);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ChaloSearchBarComposableKt.c(modifierFocusRequester, str, textStyleM6753copyp1EtxEg$default, textFieldState, (Function1) objRememberedValue, keyboardOptions, null, textFieldColors4, ComposableLambdaKt.rememberComposableLambda(-1670291969, true, new l9(viewState, textFieldState, onValueChange, onClearIconClick, 4), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 7168) | 805502976 | ((i4 << 9) & 29360128), 320);
                composer2 = composerStartRestartGroup;
                if (r1.k(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                textFieldColors3 = textFieldColors4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            }
            i4 = i3;
            textFieldColors4 = textFieldColors2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(511518099, i4, -1, "app.chalo.livetracking.universalsearch.ui.compose.SearchTextField (CitySelectionUniversalPickerScreen.kt:443)");
            }
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            long currentCompositeKeyHashCode3 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i8 = (int) (currentCompositeKeyHashCode3 ^ (currentCompositeKeyHashCode3 >>> 32));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
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
            Composer composerM3915constructorimpl3 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion5, composerM3915constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM3915constructorimpl3, currentCompositionLocalMap3);
            Updater.m3923setimpl(composerM3915constructorimpl3, modifierMaterializeModifier3, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl3, Integer.valueOf(i8), composerM3915constructorimpl3));
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion6 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode4 = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i9 = (int) (currentCompositeKeyHashCode4 ^ (currentCompositeKeyHashCode4 >>> 32));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
            Composer composerM3915constructorimpl4 = Updater.m3915constructorimpl(composerStartRestartGroup);
            pk0.v(companion5, composerM3915constructorimpl4, measurePolicyRowMeasurePolicy2, composerM3915constructorimpl4, currentCompositionLocalMap4);
            Updater.m3923setimpl(composerM3915constructorimpl4, modifierMaterializeModifier4, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion5, composerM3915constructorimpl4, Integer.valueOf(i9), composerM3915constructorimpl4));
            Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(i41.a(RowScopeInstance.INSTANCE, companion6, 1.0f, false, 2, null), focusRequester);
            String str2 = viewState.c;
            TextStyle textStyleM6753copyp1EtxEg$default2 = TextStyle.m6753copyp1EtxEg$default(ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), ChaloTheme.a(composerStartRestartGroup, 0).v0, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m6981getTextPjHm6EE(), ImeAction.INSTANCE.m6921getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            if ((458752 & i4) == 131072) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z) {
                objRememberedValue = new g0(onValueChange, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new g0(onValueChange, 29);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ChaloSearchBarComposableKt.c(modifierFocusRequester2, str2, textStyleM6753copyp1EtxEg$default2, textFieldState, (Function1) objRememberedValue, keyboardOptions2, null, textFieldColors4, ComposableLambdaKt.rememberComposableLambda(-1670291969, true, new l9(viewState, textFieldState, onValueChange, onClearIconClick, 4), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 7168) | 805502976 | ((i4 << 9) & 29360128), 320);
            composer2 = composerStartRestartGroup;
            if (r1.k(composer2)) {
                ComposerKt.traceEventEnd();
            }
            textFieldColors3 = textFieldColors4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            textFieldColors3 = textFieldColors2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new hp(modifier, focusRequester, textFieldState, viewState, textFieldColors3, onValueChange, onClearIconClick, i, i2));
        }
    }

    public static final void j(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2119470523);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2119470523, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.UseCurrentLocationComposable (CitySelectionUniversalPickerScreen.kt:396)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            ImageKt.Image(PainterResourceHelperKt.a(IconType.IC_MY_LOCATION, composerStartRestartGroup, 6), (String) null, BackgroundKt.m264backgroundbw27NRU$default(companion, Color.INSTANCE.m4642getWhite0d7_KjU(), null, 2, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, ChaloTheme.a(composerStartRestartGroup, 0).B, 0, 2, null), composerStartRestartGroup, Painter.$stable | 432, 56);
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.USE_MY_CURRENT_LOCATION, new Object[0], composerStartRestartGroup, 6), ClickableKt.m295clickableO2vRcR0$default(companion, RippleEffectKt.b(composerStartRestartGroup), null, false, null, null, function0, 28, null), ChaloTheme.a(composerStartRestartGroup, 0).B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(modifier2, function0, i, 6));
        }
    }

    public static final void k(int i, Composer composer, Modifier modifier, Function0 function0) {
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-246048325);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            Modifier.Companion companion = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-246048325, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.ViewChaloCitiesComposable (CitySelectionUniversalPickerScreen.kt:361)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) ((currentCompositeKeyHashCode >>> 32) ^ currentCompositeKeyHashCode);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            ImageKt.Image(PainterResourceHelperKt.a(IconType.BUILDING, composerStartRestartGroup, 6), (String) null, SizeKt.m828size3ABfNKs(BackgroundKt.m264backgroundbw27NRU$default(companion, Color.INSTANCE.m4642getWhite0d7_KjU(), null, 2, null), ChaloTheme.b(composerStartRestartGroup, 0).i), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m4646tintxETnrds$default(ColorFilter.INSTANCE, ChaloTheme.a(composerStartRestartGroup, 0).B, 0, 2, null), composerStartRestartGroup, Painter.$stable | 48, 56);
            SpacerKt.Spacer(SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).f), composerStartRestartGroup, 0);
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.VIEW_CITY_LIST, new Object[0], composerStartRestartGroup, 6), ClickableKt.m295clickableO2vRcR0$default(companion, RippleEffectKt.b(composerStartRestartGroup), null, false, null, null, function0, 28, null), ChaloTheme.a(composerStartRestartGroup, 0).B, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.h(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131064);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new gb(modifier2, function0, i, 7));
        }
    }
}
