package app.chalo.livetracking.universalsearch.ui.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.core.app.FrameMetricsAggregator;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.compose.PermissionsRationaleDialogKt;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.components.ChaloLoadingDialogKt;
import app.chalo.compose.components.ChaloSearchBarComposableKt;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.GenericErrorScreenComponentKt;
import app.chalo.compose.resources.StringResourcesHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloTypographyKt;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.ui.SearchErrorScreen;
import app.chalo.livetracking.universalsearch.ui.SearchScreenLayoutType;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentStopAppModel;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import com.arkivanov.decompose.extensions.compose.SubscribeAsStateKt;
import defpackage.ag1;
import defpackage.bm1;
import defpackage.cg1;
import defpackage.fl1;
import defpackage.ip;
import defpackage.jp;
import defpackage.kb;
import defpackage.lp;
import defpackage.mp;
import defpackage.pk0;
import defpackage.pp;
import defpackage.xc;
import defpackage.xs;
import defpackage.ym1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0006²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerViewState;", "viewState", "", "focusOnSearchField", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldState", "livetracking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UniversalPickerComposableKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5106a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[UniversalSearchFlowSource.values().length];
            try {
                iArr[UniversalSearchFlowSource.CITY_SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_SCREEN_MAIN_FRAGMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UniversalSearchFlowSource.STOP_BASED_ROUTE_SEARCH_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UniversalSearchFlowSource.PREMIUM_FROM_STOP_SELECTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UniversalSearchFlowSource.PREMIUM_TO_STOP_SELECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UniversalSearchFlowSource.NEAR_BY_STOPS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UniversalSearchFlowSource.TRIP_PLANNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_SCREEN_TAB.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UniversalSearchFlowSource.REGULAR_BUS_SCREEN_TAB.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UniversalSearchFlowSource.ONDC_STOP_BASED_SEARCH_SCREEN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_WORK_SELECTION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[UniversalSearchFlowSource.STOP_FOCUSED_TRIP_PLANNER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[UniversalSearchFlowSource.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[UniversalSearchFlowSource.HOME_PREFERENCE_SELECTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[UniversalSearchFlowSource.WORK_PREFERECNCE_SELECTION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f5106a = iArr;
            int[] iArr2 = new int[SearchScreenLayoutType.values().length];
            try {
                iArr2[SearchScreenLayoutType.REMOTE_SEARCHED_ITEM_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[SearchScreenLayoutType.RECENT_AND_FAVORITE_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[SearchScreenLayoutType.RECENT_RESULT_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[SearchScreenLayoutType.ERROR_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(UniversalPickerViewState universalPickerViewState, FocusRequester focusRequester, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2026691678);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(universalPickerViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2026691678, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.DefaultUniversalPickerScreen (UniversalPickerComposable.kt:151)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(universalPickerViewState.k, 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            if (universalPickerViewState.j) {
                mutableState.setValue(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m264backgroundbw27NRU$default(companion2, ChaloTheme.a(composerStartRestartGroup, 0).x, null, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
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
            pk0.v(companion3, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
            Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion3, composerM3915constructorimpl, Integer.valueOf(i3), composerM3915constructorimpl));
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(companion2, focusRequester);
            TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
            boolean z = universalPickerViewState.h;
            String str = universalPickerViewState.c;
            int i4 = i2 & 896;
            boolean z2 = i4 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new xc(function1, mutableState, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function2 = (Function1) objRememberedValue2;
            boolean z3 = i4 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new bm1(function1, 7);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            boolean z4 = i4 == 256;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new bm1(function1, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            ChaloSearchBarComposableKt.a(modifierFocusRequester, textFieldValue, z, str, function2, function0, (Function0) objRememberedValue4, composerStartRestartGroup, 0);
            i(null, universalPickerViewState, (TextFieldValue) mutableState.getValue(), function1, composerStartRestartGroup, (i2 << 3) & 7280);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pp(universalPickerViewState, focusRequester, function1, i, 3));
        }
    }

    public static final void b(final UniversalSearchRecentSearchItem universalSearchRecentSearchItem, final Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1070058899);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(universalSearchRecentSearchItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1070058899, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.FavoriteSearchedItemComposable (UniversalPickerComposable.kt:341)");
            }
            if (universalSearchRecentSearchItem instanceof UniversalSearchRecentSearchItem.Place) {
                composerStartRestartGroup.startReplaceGroup(877633913);
                RecentPlaceAppModel recentPlaceAppModel = ((UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem).c;
                String strC = recentPlaceAppModel.n;
                if (strC == null) {
                    composerStartRestartGroup.startReplaceGroup(1829429174);
                    strC = StringResourcesHelperKt.c(StringEnum.FAVORITE, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1829427314);
                    composerStartRestartGroup.endReplaceGroup();
                }
                String str = recentPlaceAppModel.g;
                int i3 = i2 & 112;
                int i4 = i2 & 14;
                boolean z = (i3 == 32) | (i4 == 4);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final int i5 = 0;
                    objRememberedValue = new Function0() { // from class: xm1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    function1.invoke(new UniversalPickerIntent.FavoritePlaceItemClicked((UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem));
                                    break;
                                case 1:
                                    RecentPlaceAppModel recentPlaceAppModel2 = ((UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem).c;
                                    function1.invoke(new UniversalPickerIntent.RemoveFavoritePlaceItem(recentPlaceAppModel2.e, recentPlaceAppModel2.h));
                                    break;
                                case 2:
                                    function1.invoke(new UniversalPickerIntent.FavoriteStopItemClicked((UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem));
                                    break;
                                default:
                                    RecentStopAppModel recentStopAppModel = ((UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem).c;
                                    function1.invoke(new UniversalPickerIntent.RemoveFavoriteStopItem(recentStopAppModel.e, recentStopAppModel.f));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean z2 = (i3 == 32) | (i4 == 4);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final int i6 = 1;
                    objRememberedValue2 = new Function0() { // from class: xm1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    function1.invoke(new UniversalPickerIntent.FavoritePlaceItemClicked((UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem));
                                    break;
                                case 1:
                                    RecentPlaceAppModel recentPlaceAppModel2 = ((UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem).c;
                                    function1.invoke(new UniversalPickerIntent.RemoveFavoritePlaceItem(recentPlaceAppModel2.e, recentPlaceAppModel2.h));
                                    break;
                                case 2:
                                    function1.invoke(new UniversalPickerIntent.FavoriteStopItemClicked((UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem));
                                    break;
                                default:
                                    RecentStopAppModel recentStopAppModel = ((UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem).c;
                                    function1.invoke(new UniversalPickerIntent.RemoveFavoriteStopItem(recentStopAppModel.e, recentStopAppModel.f));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function0 function2 = (Function0) objRememberedValue2;
                boolean z3 = (i3 == 32) | (i4 == 4);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    final int i7 = 0;
                    objRememberedValue3 = new Function1() { // from class: zm1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String favTitle = (String) obj;
                            switch (i7) {
                                case 0:
                                    Intrinsics.i(favTitle, "favTitle");
                                    function1.invoke(new UniversalPickerIntent.EditPlaceFavoriteIntent(favTitle, (UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem));
                                    break;
                                default:
                                    Intrinsics.i(favTitle, "favTitle");
                                    function1.invoke(new UniversalPickerIntent.EditStopFavoriteIntent(favTitle, (UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                RecentSearchedItemComposableKt.a(strC, str, function0, function2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                ChaloDividerComposableKt.b(null, 0L, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.endReplaceGroup();
            } else if (universalSearchRecentSearchItem instanceof UniversalSearchRecentSearchItem.Stop) {
                composerStartRestartGroup.startReplaceGroup(878755431);
                RecentStopAppModel recentStopAppModel = ((UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem).c;
                String strC2 = recentStopAppModel.k;
                if (strC2 == null) {
                    composerStartRestartGroup.startReplaceGroup(1829465302);
                    strC2 = StringResourcesHelperKt.c(StringEnum.FAVORITE, new Object[0], composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1829463504);
                    composerStartRestartGroup.endReplaceGroup();
                }
                String str2 = recentStopAppModel.g.b;
                int i8 = i2 & 112;
                int i9 = i2 & 14;
                boolean z4 = (i8 == 32) | (i9 == 4);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    final int i10 = 2;
                    objRememberedValue4 = new Function0() { // from class: xm1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i10) {
                                case 0:
                                    function1.invoke(new UniversalPickerIntent.FavoritePlaceItemClicked((UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem));
                                    break;
                                case 1:
                                    RecentPlaceAppModel recentPlaceAppModel2 = ((UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem).c;
                                    function1.invoke(new UniversalPickerIntent.RemoveFavoritePlaceItem(recentPlaceAppModel2.e, recentPlaceAppModel2.h));
                                    break;
                                case 2:
                                    function1.invoke(new UniversalPickerIntent.FavoriteStopItemClicked((UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem));
                                    break;
                                default:
                                    RecentStopAppModel recentStopAppModel2 = ((UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem).c;
                                    function1.invoke(new UniversalPickerIntent.RemoveFavoriteStopItem(recentStopAppModel2.e, recentStopAppModel2.f));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Function0 function3 = (Function0) objRememberedValue4;
                boolean z5 = (i8 == 32) | (i9 == 4);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    final int i11 = 3;
                    objRememberedValue5 = new Function0() { // from class: xm1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i11) {
                                case 0:
                                    function1.invoke(new UniversalPickerIntent.FavoritePlaceItemClicked((UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem));
                                    break;
                                case 1:
                                    RecentPlaceAppModel recentPlaceAppModel2 = ((UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem).c;
                                    function1.invoke(new UniversalPickerIntent.RemoveFavoritePlaceItem(recentPlaceAppModel2.e, recentPlaceAppModel2.h));
                                    break;
                                case 2:
                                    function1.invoke(new UniversalPickerIntent.FavoriteStopItemClicked((UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem));
                                    break;
                                default:
                                    RecentStopAppModel recentStopAppModel2 = ((UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem).c;
                                    function1.invoke(new UniversalPickerIntent.RemoveFavoriteStopItem(recentStopAppModel2.e, recentStopAppModel2.f));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function0 function4 = (Function0) objRememberedValue5;
                boolean z6 = (i8 == 32) | (i9 == 4);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    final int i12 = 1;
                    objRememberedValue6 = new Function1() { // from class: zm1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String favTitle = (String) obj;
                            switch (i12) {
                                case 0:
                                    Intrinsics.i(favTitle, "favTitle");
                                    function1.invoke(new UniversalPickerIntent.EditPlaceFavoriteIntent(favTitle, (UniversalSearchRecentSearchItem.Place) universalSearchRecentSearchItem));
                                    break;
                                default:
                                    Intrinsics.i(favTitle, "favTitle");
                                    function1.invoke(new UniversalPickerIntent.EditStopFavoriteIntent(favTitle, (UniversalSearchRecentSearchItem.Stop) universalSearchRecentSearchItem));
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                RecentSearchedItemComposableKt.a(strC2, str2, function3, function4, (Function1) objRememberedValue6, composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                ChaloDividerComposableKt.b(null, 0L, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(879795853);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new cg1(universalSearchRecentSearchItem, function1, i, 28));
        }
    }

    public static final void c(UniversalPickerViewState universalPickerViewState, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1044556737);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(universalPickerViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1044556737, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.RecentAndFavoriteComposable (UniversalPickerComposable.kt:292)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(universalPickerViewState) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jp(universalPickerViewState, function1, 2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, FrameMetricsAggregator.EVERY_DURATION);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ym1(universalPickerViewState, function1, i, 0));
        }
    }

    public static final void d(UniversalPickerViewState universalPickerViewState, Function1 function1, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-162028963);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(universalPickerViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-162028963, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.RecentSearchedResultsComposable (UniversalPickerComposable.kt:250)");
            }
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(universalPickerViewState) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new jp(universalPickerViewState, function1, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, FrameMetricsAggregator.EVERY_DURATION);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ym1(universalPickerViewState, function1, i, 1));
        }
    }

    public static final void e(UniversalPickerViewState viewState, Function1 sendIntent, TextFieldValue textFieldState, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        SearchErrorScreen searchErrorScreen = viewState.g;
        Intrinsics.i(sendIntent, "sendIntent");
        Intrinsics.i(textFieldState, "textFieldState");
        Composer composerStartRestartGroup = composer.startRestartGroup(846516247);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(sendIntent) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldState) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(846516247, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.SearchScreenErrorComposable (UniversalPickerComposable.kt:231)");
            }
            if (searchErrorScreen instanceof SearchErrorScreen.ApiErrorOccurred) {
                composerStartRestartGroup.startReplaceGroup(1753302594);
                Modifier modifierFillMaxHeight = SizeKt.fillMaxHeight(Modifier.INSTANCE, 0.7f);
                String str = ((SearchErrorScreen.ApiErrorOccurred) searchErrorScreen).f5042a;
                boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new lp(sendIntent, textFieldState, 1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                GenericErrorScreenComponentKt.a(modifierFillMaxHeight, str, false, (Function0) objRememberedValue, composerStartRestartGroup, 6, 4);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(searchErrorScreen instanceof SearchErrorScreen.NoResultFound)) {
                    throw pk0.p(composerStartRestartGroup, 1753300234);
                }
                composerStartRestartGroup.startReplaceGroup(1753313465);
                NoResultFoundComposableKt.a(0, 1, composerStartRestartGroup, null, ((SearchErrorScreen.NoResultFound) searchErrorScreen).f5043a);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new mp(viewState, sendIntent, textFieldState, i, 1));
        }
    }

    public static final void f(Function0 function0, Composer composer, int i) {
        int i2;
        Composer composer2;
        Function0 onClick = function0;
        Intrinsics.i(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-815249095);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-815249095, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerChaloBusCardComposable (UniversalPickerComposable.kt:410)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM784padding3ABfNKs = PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composerStartRestartGroup, 0).h);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0);
            int i3 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM784padding3ABfNKs);
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
            int i4 = i2;
            TextKt.m2623TextNvy7gAk(StringResourcesHelperKt.c(StringEnum.LOOKING_FOR_LUXURY_BUSES, new Object[0], composerStartRestartGroup, 6), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ChaloTypographyKt.c(ChaloTheme.e(composerStartRestartGroup, 0)), composerStartRestartGroup, 0, 0, 131070);
            ChaloSpacersKt.o(composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m814height3ABfNKs(companion, ChaloTheme.b(composerStartRestartGroup, 0).u), 0.0f, 1, null);
            boolean z = (i4 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ag1(function0, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            onClick = function0;
            CardKt.Card(ClickableKt.m299clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), ChaloTheme.d(composerStartRestartGroup, 0).d, null, CardDefaults.INSTANCE.m1695cardElevationaqJV_2Y(ChaloTheme.c(composerStartRestartGroup, 0).c, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, CardDefaults.$stable << 18, 62), null, ComposableSingletons$UniversalPickerComposableKt.d, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 20);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new kb(i, 16, onClick));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(UniversalPickerComponent universalPickerComponent, Composer composer, int i) {
        int i2;
        UniversalPickerComponent universalPickerComponent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(899244478);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(universalPickerComponent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(899244478, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposable (UniversalPickerComposable.kt:56)");
            }
            MutableState mutableStateA = SubscribeAsStateKt.a(universalPickerComponent.t0(), composerStartRestartGroup);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = xs.f(composerStartRestartGroup);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.f17583a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(universalPickerComponent);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new UniversalPickerComposableKt$UniversalPickerComposable$1$1(universalPickerComponent, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(universalPickerComponent, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i2 & 14);
            Boolean bool = (Boolean) mutableState.getValue();
            bool.booleanValue();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new UniversalPickerComposableKt$UniversalPickerComposable$2$1(focusRequester, coroutineScope, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
            UniversalPickerViewState universalPickerViewState = (UniversalPickerViewState) mutableStateA.getValue();
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(universalPickerComponent);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue6 == companion.getEmpty()) {
                universalPickerComponent2 = universalPickerComponent;
                UniversalPickerComposableKt$UniversalPickerComposable$3$1 universalPickerComposableKt$UniversalPickerComposable$3$1 = new UniversalPickerComposableKt$UniversalPickerComposable$3$1(1, universalPickerComponent2, UniversalPickerComponent.class, "processIntent", "processIntent(Lapp/chalo/livetracking/universalsearch/ui/UniversalPickerIntent;)V", 0);
                composerStartRestartGroup.updateRememberedValue(universalPickerComposableKt$UniversalPickerComposable$3$1);
                objRememberedValue6 = universalPickerComposableKt$UniversalPickerComposable$3$1;
            } else {
                universalPickerComponent2 = universalPickerComponent;
            }
            h(universalPickerViewState, focusRequester, (Function1) ((KFunction) objRememberedValue6), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            universalPickerComponent2 = universalPickerComponent;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fl1(universalPickerComponent2, i, 10));
        }
    }

    public static final void h(UniversalPickerViewState viewState, FocusRequester focusRequester, Function1 sendIntent, Composer composer, int i) {
        int i2;
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(focusRequester, "focusRequester");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1047289762);
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
                ComposerKt.traceEventStart(1047289762, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerContent (UniversalPickerComposable.kt:93)");
            }
            if (viewState.i) {
                composerStartRestartGroup.startReplaceGroup(1167053180);
                ChaloLoadingDialogKt.b(null, false, null, composerStartRestartGroup, 0, 7);
            } else {
                composerStartRestartGroup.startReplaceGroup(1163209056);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (viewState.t) {
                composerStartRestartGroup.startReplaceGroup(1167157712);
                String strC = StringResourcesHelperKt.c(StringEnum.LOCATION_PERMISSION_PROMPT, new Object[0], composerStartRestartGroup, 6);
                int i3 = i2 & 896;
                boolean z = i3 == 256;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new bm1(sendIntent, 5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                boolean z2 = i3 == 256;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new bm1(sendIntent, 6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                PermissionsRationaleDialogKt.a(strC, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(1163209056);
            }
            composerStartRestartGroup.endReplaceGroup();
            switch (WhenMappings.f5106a[viewState.l.ordinal()]) {
                case 1:
                    composerStartRestartGroup.startReplaceGroup(1423139811);
                    CitySelectionUniversalPickerScreenKt.g(viewState, focusRequester, sendIntent, composerStartRestartGroup, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    composerStartRestartGroup.startReplaceGroup(1168457821);
                    a(viewState, focusRequester, sendIntent, composerStartRestartGroup, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 13:
                    composerStartRestartGroup.startReplaceGroup(1168690910);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 14:
                case 15:
                    composerStartRestartGroup.startReplaceGroup(1168825264);
                    HomeOrWorkPreferenceUniversalPickerScreenKt.c(viewState, focusRequester, sendIntent, composerStartRestartGroup, i2 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED);
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                default:
                    throw pk0.p(composerStartRestartGroup, 1423138618);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new pp(viewState, focusRequester, sendIntent, i, 2));
        }
    }

    public static final void i(Modifier modifier, UniversalPickerViewState viewState, TextFieldValue textFieldState, Function1 sendIntent, Composer composer, int i) {
        Intrinsics.i(viewState, "viewState");
        Intrinsics.i(textFieldState, "textFieldState");
        Intrinsics.i(sendIntent, "sendIntent");
        Composer composerStartRestartGroup = composer.startRestartGroup(327568100);
        int i2 = i | 6;
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
            modifier = Modifier.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(327568100, i2, -1, "app.chalo.livetracking.universalsearch.ui.compose.UniversalSearchLayout (UniversalPickerComposable.kt:192)");
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
            int i4 = WhenMappings.b[viewState.f.ordinal()];
            if (i4 == 1) {
                composerStartRestartGroup.startReplaceGroup(-963214202);
                UniversalSearchListComposableKt.c(viewState.b, viewState.d, viewState.e, textFieldState, sendIntent, composerStartRestartGroup, (i2 << 3) & 64512);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 == 2) {
                composerStartRestartGroup.startReplaceGroup(-963200129);
                c(viewState, sendIntent, composerStartRestartGroup, ((i2 >> 3) & 14) | ((i2 >> 6) & 112));
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 == 3) {
                composerStartRestartGroup.startReplaceGroup(-963193405);
                d(viewState, sendIntent, composerStartRestartGroup, ((i2 >> 3) & 14) | ((i2 >> 6) & 112));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 != 4) {
                    throw pk0.p(composerStartRestartGroup, -963216979);
                }
                composerStartRestartGroup.startReplaceGroup(-963186764);
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
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ip(modifier2, viewState, textFieldState, sendIntent, i, 2));
        }
    }
}
