package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import app.chalo.compose.components.ChaloDividerComposableKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchItem;
import app.chalo.livetracking.universalsearch.data.model.app.UniversalSearchRecentSearchedDataItem;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerViewState;
import app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$CitySelectionUniversalPickerScreenKt;
import app.chalo.livetracking.universalsearch.ui.compose.ComposableSingletons$UniversalPickerComposableKt;
import app.chalo.recent.model.app.UniversalSearchDescriptiveLocationAppModel;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jp implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17426a;
    public final /* synthetic */ UniversalPickerViewState b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ jp(UniversalPickerViewState universalPickerViewState, Function1 function1, int i) {
        this.f17426a = i;
        this.b = universalPickerViewState;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17426a) {
            case 0:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                final UniversalPickerViewState universalPickerViewState = this.b;
                if (!universalPickerViewState.f5084a.f4998a.isEmpty()) {
                    LazyListScope.CC.m(LazyColumn, null, null, ComposableSingletons$CitySelectionUniversalPickerScreenKt.f5092a, 3, null);
                    final List list = universalPickerViewState.f5084a.f4998a;
                    int size = list.size();
                    Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt$CitySearchRecentSearchedResultsComposable$lambda$0$0$$inlined$itemsIndexed$default$2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            list.get(((Number) obj2).intValue());
                            return null;
                        }
                    };
                    final Function1 function2 = this.c;
                    LazyColumn.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.CitySelectionUniversalPickerScreenKt$CitySearchRecentSearchedResultsComposable$lambda$0$0$$inlined$itemsIndexed$default$3
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                            int iIntValue = ((Number) obj3).intValue();
                            Composer composer = (Composer) obj4;
                            int iIntValue2 = ((Number) obj5).intValue();
                            if ((iIntValue2 & 6) == 0) {
                                i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                            } else {
                                i = iIntValue2;
                            }
                            if ((iIntValue2 & 48) == 0) {
                                i |= composer.changed(iIntValue) ? 32 : 16;
                            }
                            if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                                }
                                UniversalSearchRecentSearchItem universalSearchRecentSearchItem = (UniversalSearchRecentSearchItem) list.get(iIntValue);
                                composer.startReplaceGroup(-1781964312);
                                Composer composer2 = composer;
                                RecentSearchedItemComposableKt.b(universalSearchRecentSearchItem, false, false, function2, composer2, 432);
                                if (iIntValue < CollectionsKt.K(universalPickerViewState.f5084a.f4998a)) {
                                    composer2.startReplaceGroup(-1781653910);
                                    ChaloDividerComposableKt.b(null, ChaloTheme.a(composer2, 0).e, composer2, 0, 1);
                                    composer2 = composer2;
                                } else {
                                    composer2.startReplaceGroup(-1793168984);
                                }
                                composer2.endReplaceGroup();
                                composer2.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }));
                }
                break;
            case 1:
                LazyListScope LazyColumn2 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn2, "$this$LazyColumn");
                final UniversalPickerViewState universalPickerViewState2 = this.b;
                if (!universalPickerViewState2.f5084a.f4998a.isEmpty()) {
                    final List list2 = universalPickerViewState2.f5084a.f4998a;
                    int size2 = list2.size();
                    Function1<Integer, Object> function3 = new Function1<Integer, Object>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.HomeOrWorkPreferenceUniversalPickerScreenKt$HomeOrWorkPreferenceRecentSearchedResultsComposable$lambda$0$0$$inlined$itemsIndexed$default$2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            list2.get(((Number) obj2).intValue());
                            return null;
                        }
                    };
                    final Function1 function4 = this.c;
                    LazyColumn2.items(size2, null, function3, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.HomeOrWorkPreferenceUniversalPickerScreenKt$HomeOrWorkPreferenceRecentSearchedResultsComposable$lambda$0$0$$inlined$itemsIndexed$default$3
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                            int iIntValue = ((Number) obj3).intValue();
                            Composer composer = (Composer) obj4;
                            int iIntValue2 = ((Number) obj5).intValue();
                            if ((iIntValue2 & 6) == 0) {
                                i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                            } else {
                                i = iIntValue2;
                            }
                            if ((iIntValue2 & 48) == 0) {
                                i |= composer.changed(iIntValue) ? 32 : 16;
                            }
                            if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                                }
                                UniversalSearchRecentSearchItem universalSearchRecentSearchItem = (UniversalSearchRecentSearchItem) list2.get(iIntValue);
                                composer.startReplaceGroup(1026894990);
                                Composer composer2 = composer;
                                RecentSearchedItemComposableKt.b(universalSearchRecentSearchItem, false, false, function4, composer2, 432);
                                if (iIntValue < CollectionsKt.K(universalPickerViewState2.f5084a.f4998a)) {
                                    composer2.startReplaceGroup(1027205392);
                                    ChaloDividerComposableKt.b(null, ChaloTheme.a(composer2, 0).e, composer2, 0, 1);
                                    composer2 = composer2;
                                } else {
                                    composer2.startReplaceGroup(1018921262);
                                }
                                composer2.endReplaceGroup();
                                composer2.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }));
                }
                break;
            case 2:
                LazyListScope LazyColumn3 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn3, "$this$LazyColumn");
                final UniversalPickerViewState universalPickerViewState3 = this.b;
                UniversalSearchDescriptiveLocationAppModel universalSearchDescriptiveLocationAppModel = universalPickerViewState3.r;
                UniversalSearchRecentSearchedDataItem universalSearchRecentSearchedDataItem = universalPickerViewState3.f5084a;
                final Function1 function5 = this.c;
                if (universalSearchDescriptiveLocationAppModel != null && universalPickerViewState3.s) {
                    LazyListScope.CC.m(LazyColumn3, null, null, ComposableLambdaKt.composableLambdaInstance(-1878404879, true, new ab(function5, 13)), 3, null);
                }
                final List list3 = universalSearchRecentSearchedDataItem.f4998a;
                if (!list3.isEmpty()) {
                    if (universalSearchRecentSearchedDataItem.b) {
                        LazyListScope.CC.m(LazyColumn3, null, null, ComposableSingletons$UniversalPickerComposableKt.b, 3, null);
                        LazyColumn3.items(list3.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt$RecentAndFavoriteComposable$lambda$0$0$$inlined$items$default$3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                list3.get(((Number) obj2).intValue());
                                return null;
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt$RecentAndFavoriteComposable$lambda$0$0$$inlined$items$default$4
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i;
                                LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Composer composer = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                                } else {
                                    i = iIntValue2;
                                }
                                if ((iIntValue2 & 48) == 0) {
                                    i |= composer.changed(iIntValue) ? 32 : 16;
                                }
                                if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                    }
                                    UniversalSearchRecentSearchItem universalSearchRecentSearchItem = (UniversalSearchRecentSearchItem) list3.get(iIntValue);
                                    composer.startReplaceGroup(-1848069580);
                                    if (universalSearchRecentSearchItem.b) {
                                        composer.startReplaceGroup(-1848046517);
                                        UniversalPickerComposableKt.b(universalSearchRecentSearchItem, function5, composer, 0);
                                    } else {
                                        composer.startReplaceGroup(-1859697092);
                                    }
                                    composer.endReplaceGroup();
                                    composer.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }));
                    }
                    if (universalSearchRecentSearchedDataItem.c) {
                        LazyListScope.CC.m(LazyColumn3, null, null, ComposableSingletons$UniversalPickerComposableKt.c, 3, null);
                        LazyColumn3.items(list3.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt$RecentAndFavoriteComposable$lambda$0$0$$inlined$items$default$7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                list3.get(((Number) obj2).intValue());
                                return null;
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt$RecentAndFavoriteComposable$lambda$0$0$$inlined$items$default$8
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int i;
                                Composer composer;
                                LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                                int iIntValue = ((Number) obj3).intValue();
                                Composer composer2 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                if ((iIntValue2 & 6) == 0) {
                                    i = (composer2.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                                } else {
                                    i = iIntValue2;
                                }
                                if ((iIntValue2 & 48) == 0) {
                                    i |= composer2.changed(iIntValue) ? 32 : 16;
                                }
                                if (composer2.shouldExecute((i & 147) != 146, i & 1)) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                    }
                                    UniversalSearchRecentSearchItem universalSearchRecentSearchItem = (UniversalSearchRecentSearchItem) list3.get(iIntValue);
                                    composer2.startReplaceGroup(2114208542);
                                    if (universalSearchRecentSearchItem.b) {
                                        composer = composer2;
                                        composer.startReplaceGroup(2102045381);
                                    } else {
                                        composer2.startReplaceGroup(2114235449);
                                        RecentSearchedItemComposableKt.b(universalSearchRecentSearchItem, universalPickerViewState3.e, true, function5, composer2, 384);
                                        ChaloDividerComposableKt.b(null, 0L, composer2, 0, 3);
                                        composer = composer2;
                                    }
                                    composer.endReplaceGroup();
                                    composer.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer2.skipToGroupEnd();
                                }
                                return Unit.f17538a;
                            }
                        }));
                    }
                }
                break;
            default:
                LazyListScope LazyColumn4 = (LazyListScope) obj;
                Intrinsics.i(LazyColumn4, "$this$LazyColumn");
                final UniversalPickerViewState universalPickerViewState4 = this.b;
                boolean z = universalPickerViewState4.q;
                UniversalSearchRecentSearchedDataItem universalSearchRecentSearchedDataItem2 = universalPickerViewState4.f5084a;
                final Function1 function6 = this.c;
                if (z) {
                    LazyListScope.CC.m(LazyColumn4, null, null, ComposableLambdaKt.composableLambdaInstance(413708173, true, new ab(function6, 11)), 3, null);
                }
                if (universalPickerViewState4.r != null && universalPickerViewState4.s) {
                    LazyListScope.CC.m(LazyColumn4, null, null, ComposableLambdaKt.composableLambdaInstance(1927728580, true, new ab(function6, 12)), 3, null);
                }
                if (!universalSearchRecentSearchedDataItem2.f4998a.isEmpty()) {
                    LazyListScope.CC.m(LazyColumn4, null, null, ComposableSingletons$UniversalPickerComposableKt.f5093a, 3, null);
                    final List list4 = universalSearchRecentSearchedDataItem2.f4998a;
                    LazyColumn4.items(list4.size(), null, new Function1<Integer, Object>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt$RecentSearchedResultsComposable$lambda$0$0$$inlined$items$default$3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            list4.get(((Number) obj2).intValue());
                            return null;
                        }
                    }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.livetracking.universalsearch.ui.compose.UniversalPickerComposableKt$RecentSearchedResultsComposable$lambda$0$0$$inlined$items$default$4
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                            int i;
                            LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                            int iIntValue = ((Number) obj3).intValue();
                            Composer composer = (Composer) obj4;
                            int iIntValue2 = ((Number) obj5).intValue();
                            if ((iIntValue2 & 6) == 0) {
                                i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                            } else {
                                i = iIntValue2;
                            }
                            if ((iIntValue2 & 48) == 0) {
                                i |= composer.changed(iIntValue) ? 32 : 16;
                            }
                            if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                }
                                UniversalSearchRecentSearchItem universalSearchRecentSearchItem = (UniversalSearchRecentSearchItem) list4.get(iIntValue);
                                composer.startReplaceGroup(555126478);
                                RecentSearchedItemComposableKt.b(universalSearchRecentSearchItem, universalPickerViewState4.e, false, function6, composer, 384);
                                ChaloDividerComposableKt.b(null, 0L, composer, 0, 3);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer.skipToGroupEnd();
                            }
                            return Unit.f17538a;
                        }
                    }));
                }
                break;
        }
        return Unit.f17538a;
    }
}
