package defpackage;

import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import app.chalo.appsupport.BookingHelpScreenUIKt;
import app.chalo.appsupport.uistate.BookingHelpScreenViewState;
import app.chalo.appsupport.uistate.FaqItemUiState;
import app.chalo.compose.components.ChaloSpacersKt;
import app.chalo.compose.components.text.TitleSubtitleViewKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.compose.theme.ChaloThemeKt;
import app.chalo.data.BackgroundShape;
import app.chalo.home.ui.chalobus.ProductPurchaseNudgeDisplayInfo;
import app.chalo.home.ui.history.compose.MyTicketsScreenUIKt;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.livetracking.stoptripplannerresult.compose.components.TripPlannerTabUIKt;
import app.chalo.livetracking.stoptripplannerresult.uistate.StopBasedTripPlannerUiState;
import app.chalo.onboarding.languageselection.LanguageGridUiState;
import app.chalo.onboarding.languageselection.LanguageUiState;
import app.chalo.onboarding.languageselection.ui.LanguageSelectionScreenKt;
import app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardUiState;
import app.chalo.productpurchase.passselection.ui.PassCategorySelectionTabScreen;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenKt;
import app.chalo.productpurchase.passselection.ui.PassSelectionScreenTypeUIState;
import app.chalo.productpurchase.passselection.ui.SubCategoryBubbleUIState;
import app.chalo.productsummary.ui.data.DocumentationUIState;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.BorderUISpecKt;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIStateKt;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.userprofile.ui.ProfileIconWithEditBtnUISpecs;
import app.chalo.userprofile.ui.compose.UserProfileComposeUtilsKt;
import app.zophop.homescreen.MyTicketsViewState;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o4 implements Function4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18567a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o4(Object obj, int i) {
        this.f18567a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f18567a;
        Unit unit = Unit.f17538a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                return AndroidParagraphIntrinsics._init_$lambda$0((AndroidParagraphIntrinsics) obj5, (FontFamily) obj, (FontWeight) obj2, (FontStyle) obj3, (FontSynthesis) obj4);
            case 1:
                BookingHelpScreenViewState bookingHelpScreenViewState = (BookingHelpScreenViewState) obj5;
                LazyItemScope items = (LazyItemScope) obj;
                int iIntValue = ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                Intrinsics.i(items, "$this$items");
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= composer.changed(iIntValue) ? 32 : 16;
                }
                if (composer.shouldExecute((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-461535219, iIntValue2, -1, "app.chalo.appsupport.BookingHelpScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BookingHelpScreenUI.kt:102)");
                    }
                    BookingHelpScreenUIKt.c(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (FaqItemUiState) bookingHelpScreenViewState.d.get(iIntValue), composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 2:
                ProductPurchaseNudgeDisplayInfo productPurchaseNudgeDisplayInfo = (ProductPurchaseNudgeDisplayInfo) obj5;
                SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it, "it");
                if (composer2.shouldExecute((iIntValue3 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue3 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1777050526, iIntValue3, -1, "app.chalo.home.ui.chalobus.ProductPurchaseNudgeCard.<anonymous>.<anonymous>.<anonymous> (ChaloBusScreenUI.kt:820)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM786paddingVpY3zN4$default = PaddingKt.m786paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ChaloTheme.b(composer2, 0).h, 0.0f, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    long currentCompositeKeyHashCode = ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0);
                    int i2 = (int) (currentCompositeKeyHashCode ^ (currentCompositeKeyHashCode >>> 32));
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM786paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3915constructorimpl = Updater.m3915constructorimpl(composer2);
                    pk0.v(companion2, composerM3915constructorimpl, measurePolicyColumnMeasurePolicy, composerM3915constructorimpl, currentCompositionLocalMap);
                    Updater.m3923setimpl(composerM3915constructorimpl, modifierMaterializeModifier, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion2, composerM3915constructorimpl, Integer.valueOf(i2), composerM3915constructorimpl));
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    ChaloSpacersKt.o(composer2, 0);
                    ImageKt.Image(PainterResourceHelperKt.a(IconType.BUS_PASS, composer2, 6), "", SizeKt.m828size3ABfNKs(companion, ChaloTheme.b(composer2, 0).p), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, Painter.$stable | 24624, 104);
                    ChaloSpacersKt.n(composer2, 0);
                    String str = productPurchaseNudgeDisplayInfo.f3298a;
                    TextStyle bodyMedium = ChaloTheme.e(composer2, 0).getBodyMedium();
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    long j = ChaloTheme.a(composer2, 0).t0;
                    TextOverflow.Companion companion3 = TextOverflow.INSTANCE;
                    TextKt.m2623TextNvy7gAk(str, null, j, null, 0L, null, bold, null, 0L, null, null, 0L, companion3.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, bodyMedium, composer2, 1572864, 24960, 110522);
                    ChaloSpacersKt.n(composer2, 0);
                    TextKt.m2623TextNvy7gAk(productPurchaseNudgeDisplayInfo.d, null, ChaloTheme.a(composer2, 0).t0, null, 0L, null, null, null, 0L, null, null, 0L, companion3.m7226getEllipsisgIe3tQ8(), false, 2, 0, null, ChaloTheme.e(composer2, 0).getBodySmall(), composer2, 0, 24960, 110586);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 3:
                return FrameworkSQLiteDatabase.query$lambda$0((SupportSQLiteQuery) obj5, (SQLiteDatabase) obj, (SQLiteCursorDriver) obj2, (String) obj3, (SQLiteQuery) obj4);
            case 4:
                ImageResourceSectionAppModel imageResourceSectionAppModel = (ImageResourceSectionAppModel) obj5;
                SubcomposeAsyncImageScope SubcomposeAsyncImage2 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Error it2 = (AsyncImagePainter.State.Error) obj2;
                Composer composer3 = (Composer) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage2, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it2, "it");
                if (composer3.shouldExecute((iIntValue4 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue4 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1474805737, iIntValue4, -1, "app.chalo.home.ui.common.ImageResourceSectionUI.<anonymous>.<anonymous>.<anonymous> (ImageResourceSectionUI.kt:73)");
                    }
                    IconType iconType = imageResourceSectionAppModel.h;
                    if (iconType == null) {
                        composer3.startReplaceGroup(1577779287);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1577779288);
                        ImageKt.Image(PainterResourceHelperKt.a(iconType, composer3, 0), (String) null, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, Painter.$stable | 25008, 104);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return unit;
            case 5:
                LanguageGridUiState languageGridUiState = (LanguageGridUiState) obj5;
                LazyGridItemScope items2 = (LazyGridItemScope) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                Intrinsics.i(items2, "$this$items");
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= composer4.changed(iIntValue5) ? 32 : 16;
                }
                if (composer4.shouldExecute((iIntValue6 & 145) != 144, iIntValue6 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1759357018, iIntValue6, -1, "app.chalo.onboarding.languageselection.ui.LanguageSelectionGrid.<anonymous>.<anonymous>.<anonymous> (LanguageSelectionScreen.kt:192)");
                    }
                    LanguageUiState languageUiState = (LanguageUiState) languageGridUiState.f6645a.get(iIntValue5);
                    BackgroundShape.Companion companion4 = BackgroundShape.INSTANCE;
                    LanguageSelectionScreenKt.a(null, languageUiState, composer4, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer4.skipToGroupEnd();
                }
                return unit;
            case 6:
                MyTicketsViewState myTicketsViewState = (MyTicketsViewState) obj5;
                LazyItemScope stickyHeader = (LazyItemScope) obj;
                ((Integer) obj2).intValue();
                Composer composer5 = (Composer) obj3;
                int iIntValue7 = ((Integer) obj4).intValue();
                Intrinsics.i(stickyHeader, "$this$stickyHeader");
                if (composer5.shouldExecute((iIntValue7 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue7 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(53688772, iIntValue7, -1, "app.chalo.home.ui.history.compose.TicketsScreenContentUI.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyTicketsScreenUI.kt:262)");
                    }
                    MyTicketsScreenUIKt.a(myTicketsViewState.h, composer5, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer5.skipToGroupEnd();
                }
                return unit;
            case 7:
                PBProductCardUiState pBProductCardUiState = (PBProductCardUiState) obj5;
                SubcomposeAsyncImageScope SubcomposeAsyncImage3 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Error it3 = (AsyncImagePainter.State.Error) obj2;
                Composer composer6 = (Composer) obj3;
                int iIntValue8 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage3, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it3, "it");
                if (composer6.shouldExecute((iIntValue8 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue8 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1581758815, iIntValue8, -1, "app.chalo.premiumbus.ui.productselection.compose.uistate.PBProductCardComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PBProductCardComposable.kt:152)");
                    }
                    TitleSubtitleViewKt.a(PaddingKt.m784padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), pBProductCardUiState.f7703a.h), pBProductCardUiState.d, composer6, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer6.skipToGroupEnd();
                }
                return unit;
            case 8:
                PassSelectionScreenTypeUIState.SubCategorySelection subCategorySelection = (PassSelectionScreenTypeUIState.SubCategorySelection) obj5;
                LazyGridItemScope items3 = (LazyGridItemScope) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                Composer composer7 = (Composer) obj3;
                int iIntValue10 = ((Integer) obj4).intValue();
                Intrinsics.i(items3, "$this$items");
                if ((iIntValue10 & 48) == 0) {
                    iIntValue10 |= composer7.changed(iIntValue9) ? 32 : 16;
                }
                if (composer7.shouldExecute((iIntValue10 & 145) != 144, iIntValue10 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1279420127, iIntValue10, -1, "app.chalo.productpurchase.passselection.ui.PassSubCategorySelectionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PassSelectionScreen.kt:118)");
                    }
                    PassSelectionScreenKt.h((SubCategoryBubbleUIState) subCategorySelection.c.b.get(iIntValue9), null, composer7, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer7.skipToGroupEnd();
                }
                return unit;
            case 9:
                PassSelectionScreenTypeUIState.CategorySelection categorySelection = (PassSelectionScreenTypeUIState.CategorySelection) obj5;
                PagerScope HorizontalPager = (PagerScope) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                Composer composer8 = (Composer) obj3;
                int iIntValue12 = ((Integer) obj4).intValue();
                Intrinsics.i(HorizontalPager, "$this$HorizontalPager");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1183780723, iIntValue12, -1, "app.chalo.productpurchase.passselection.ui.PassCategorySelection.<anonymous>.<anonymous> (PassSelectionScreen.kt:179)");
                }
                PassSelectionScreenKt.d((PassCategorySelectionTabScreen) categorySelection.b.get(iIntValue11), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer8, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return unit;
            case 10:
                DocumentationUIState documentationUIState = (DocumentationUIState) obj5;
                ImageUrlUIState imageUrlUIState = documentationUIState.f8750a;
                SubcomposeAsyncImageScope SubcomposeAsyncImage4 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Success it4 = (AsyncImagePainter.State.Success) obj2;
                Composer composer9 = (Composer) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage4, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it4, "it");
                if ((iIntValue13 & 48) == 0) {
                    iIntValue13 |= (iIntValue13 & 64) == 0 ? composer9.changed(it4) : composer9.changedInstance(it4) ? 32 : 16;
                }
                if (composer9.shouldExecute((iIntValue13 & 145) != 144, iIntValue13 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-992675173, iIntValue13, -1, "app.chalo.productsummary.ui.compose.PassVerificationProofComponent.<anonymous>.<anonymous>.<anonymous> (PassSummarySuccessMainScreen.kt:295)");
                    }
                    Painter painter = it4.f11481a;
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    BorderUISpec borderUISpec = documentationUIState.b;
                    ImageUISize imageUISize = imageUrlUIState.c;
                    if (imageUISize == null) {
                        composer9.startReplaceGroup(-478094405);
                        imageUISize = new ImageUISize(Dp.m7276boximpl(ChaloTheme.b(composer9, 0).s), Dp.m7276boximpl(ChaloTheme.b(composer9, 0).t));
                    } else {
                        composer9.startReplaceGroup(-478095366);
                    }
                    composer9.endReplaceGroup();
                    Modifier modifierA = BorderUISpecKt.a(ClipKt.clip(ImageUIStateKt.b(companion5, imageUISize), ChaloThemeKt.d(borderUISpec.c)), borderUISpec);
                    boolean zChanged = composer9.changed(documentationUIState);
                    Object objRememberedValue = composer9.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new kn0(documentationUIState, 8);
                        composer9.updateRememberedValue(objRememberedValue);
                    }
                    ImageKt.Image(painter, (String) null, ClickableKt.m299clickableoSLSa3U$default(modifierA, false, null, null, null, (Function0) objRememberedValue, 15, null), (Alignment) null, ImageUIStateKt.c(imageUrlUIState.d), 0.0f, (ColorFilter) null, composer9, Painter.$stable | 48, 104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer9.skipToGroupEnd();
                }
                return unit;
            case 11:
                String str2 = (String) obj5;
                SubcomposeAsyncImageScope SubcomposeAsyncImage5 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Success it5 = (AsyncImagePainter.State.Success) obj2;
                Composer composer10 = (Composer) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage5, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it5, "it");
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= (iIntValue14 & 64) == 0 ? composer10.changed(it5) : composer10.changedInstance(it5) ? 32 : 16;
                }
                if (composer10.shouldExecute((iIntValue14 & 145) != 144, iIntValue14 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(852198581, iIntValue14, -1, "app.chalo.home.ui.chalobus.PremiumBusTutorialCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PremiumBusTutorialCard.kt:63)");
                    }
                    ImageKt.Image(it5.f11481a, str2, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getTopCenter(), ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer10, Painter.$stable | 28032, 96);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer10.skipToGroupEnd();
                }
                return unit;
            case 12:
                Function2 function2 = (Function2) obj5;
                LazyItemScope stickyHeader2 = (LazyItemScope) obj;
                ((Integer) obj2).intValue();
                Composer composer11 = (Composer) obj3;
                int iIntValue15 = ((Integer) obj4).intValue();
                Intrinsics.i(stickyHeader2, "$this$stickyHeader");
                if (composer11.shouldExecute((iIntValue15 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue15 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1445781836, iIntValue15, -1, "app.chalo.livetracking.routedetails.ui.routedetailsscreen.compose.screentype.TimeTableHeading.<anonymous> (RouteTimeTable.kt:94)");
                    }
                    if (t8.q(composer11, 0, function2)) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer11.skipToGroupEnd();
                }
                return unit;
            case 13:
                return SelectionManager._init_$lambda$1((SelectionManager) obj5, ((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, (Offset) obj3, (SelectionAdjustment) obj4);
            case 14:
                StopBasedTripPlannerUiState stopBasedTripPlannerUiState = (StopBasedTripPlannerUiState) obj5;
                LazyItemScope stickyHeader3 = (LazyItemScope) obj;
                ((Integer) obj2).intValue();
                Composer composer12 = (Composer) obj3;
                int iIntValue16 = ((Integer) obj4).intValue();
                Intrinsics.i(stickyHeader3, "$this$stickyHeader");
                if (composer12.shouldExecute((iIntValue16 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue16 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1332071477, iIntValue16, -1, "app.chalo.livetracking.stoptripplannerresult.compose.StopTripPlannerResultScreen.<anonymous>.<anonymous>.<anonymous> (StopBasedTripPlannerResultScreen.kt:267)");
                    }
                    TripPlannerTabUIKt.a(stopBasedTripPlannerUiState.c, composer12, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer12.skipToGroupEnd();
                }
                return unit;
            default:
                ProfileIconWithEditBtnUISpecs profileIconWithEditBtnUISpecs = (ProfileIconWithEditBtnUISpecs) obj5;
                SubcomposeAsyncImageScope SubcomposeAsyncImage6 = (SubcomposeAsyncImageScope) obj;
                AsyncImagePainter.State.Loading it6 = (AsyncImagePainter.State.Loading) obj2;
                Composer composer13 = (Composer) obj3;
                int iIntValue17 = ((Integer) obj4).intValue();
                Intrinsics.i(SubcomposeAsyncImage6, "$this$SubcomposeAsyncImage");
                Intrinsics.i(it6, "it");
                if (composer13.shouldExecute((iIntValue17 & TsExtractor.TS_STREAM_TYPE_AC3) != 128, iIntValue17 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(654609534, iIntValue17, -1, "app.chalo.userprofile.ui.compose.UserProfilePicComposable.<anonymous>.<anonymous> (UserProfileFormScreen.kt:297)");
                    }
                    Modifier modifierClip = ClipKt.clip(SizeKt.m828size3ABfNKs(Modifier.INSTANCE, profileIconWithEditBtnUISpecs.e), RoundedCornerShapeKt.getCircleShape());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    long currentCompositeKeyHashCode2 = ComposablesKt.getCurrentCompositeKeyHashCode(composer13, 0);
                    int i3 = (int) (currentCompositeKeyHashCode2 ^ (currentCompositeKeyHashCode2 >>> 32));
                    CompositionLocalMap currentCompositionLocalMap2 = composer13.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer13, modifierClip);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                    if (composer13.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer13.startReusableNode();
                    if (composer13.getInserting()) {
                        composer13.createNode(constructor2);
                    } else {
                        composer13.useNode();
                    }
                    Composer composerM3915constructorimpl2 = Updater.m3915constructorimpl(composer13);
                    pk0.v(companion6, composerM3915constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3915constructorimpl2, currentCompositionLocalMap2);
                    Updater.m3923setimpl(composerM3915constructorimpl2, modifierMaterializeModifier2, (Function2<? super T, ? super Modifier, Unit>) pk0.q(companion6, composerM3915constructorimpl2, Integer.valueOf(i3), composerM3915constructorimpl2));
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    UserProfileComposeUtilsKt.a(composer13, 0);
                    UserProfileComposeUtilsKt.b(composer13, 0);
                    composer13.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer13.skipToGroupEnd();
                }
                return unit;
        }
    }
}
