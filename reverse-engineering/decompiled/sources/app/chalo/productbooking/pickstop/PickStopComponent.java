package app.chalo.productbooking.pickstop;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.Source;
import app.chalo.instantticket.domain.FilterAndSortMatchingStopsUseCase;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.network.config.ChaloJson;
import app.chalo.productbooking.common.data.models.app.ProductBookingStopDetails;
import app.chalo.productbooking.pickstop.PickStopComponent;
import app.chalo.productbooking.pickstop.PickStopIntent;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.resultstatemanager.instantticket.RouteSearchResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.PickStopArgs;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.button.IconButtonUIState;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import app.chalo.uistate.textField.TextFieldEventHandlerHelper;
import app.chalo.uistate.textField.TextFieldLabelPlaceholderUIState;
import com.arkivanov.decompose.ComponentContext;
import defpackage.fr0;
import defpackage.gf;
import defpackage.ir0;
import defpackage.xr0;
import defpackage.ym0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/productbooking/pickstop/PickStopComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/productbooking/pickstop/PickStopIntent;", "Lapp/chalo/productbooking/pickstop/PickStopDataState;", "Lapp/chalo/productbooking/pickstop/PickStopViewState;", "Lapp/chalo/productbooking/pickstop/PickStopSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PickStopComponent extends ChaloBaseStateMviComponent<PickStopIntent, PickStopDataState, PickStopViewState, PickStopSideEffect> {
    public final PickStopArgs k;
    public final FilterAndSortMatchingStopsUseCase l;
    public final RouteSearchResultStateManager m;
    public final ChaloNavigationManager n;
    public final StringProvider o;
    public final AnalyticsContract p;
    public List q;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8298a;

        static {
            int[] iArr = new int[ChaloTransitMode.values().length];
            try {
                iArr[ChaloTransitMode.METRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChaloTransitMode.BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChaloTransitMode.TRAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChaloTransitMode.MONORAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChaloTransitMode.FERRY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChaloTransitMode.CAB.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChaloTransitMode.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChaloTransitMode.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f8298a = iArr;
        }
    }

    public PickStopComponent(ComponentContext componentContext, PickStopArgs pickStopArgs, FilterAndSortMatchingStopsUseCase filterAndSortMatchingStopsUseCase, RouteSearchResultStateManager routeSearchResultStateManager, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, AnalyticsContract analyticsContract) {
        super(componentContext);
        this.k = pickStopArgs;
        this.l = filterAndSortMatchingStopsUseCase;
        this.m = routeSearchResultStateManager;
        this.n = chaloNavigationManager;
        this.o = stringProvider;
        this.p = analyticsContract;
        this.q = EmptyList.f17557a;
        I0(PickStopIntent.InitialIntent.f8303a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r2 == r4) goto L38;
     */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(app.chalo.productbooking.pickstop.PickStopDataState r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productbooking.pickstop.PickStopComponent.p0(app.chalo.productbooking.pickstop.PickStopDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object G0(List list, ContinuationImpl continuationImpl) {
        PickStopComponent$getLayoutUiType$1 pickStopComponent$getLayoutUiType$1;
        IconType iconType;
        TextUIState.ChaloTextUIState chaloTextUIState;
        if (continuationImpl instanceof PickStopComponent$getLayoutUiType$1) {
            pickStopComponent$getLayoutUiType$1 = (PickStopComponent$getLayoutUiType$1) continuationImpl;
            int i = pickStopComponent$getLayoutUiType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pickStopComponent$getLayoutUiType$1.label = i - Integer.MIN_VALUE;
            } else {
                pickStopComponent$getLayoutUiType$1 = new PickStopComponent$getLayoutUiType$1(this, continuationImpl);
            }
        } else {
            pickStopComponent$getLayoutUiType$1 = new PickStopComponent$getLayoutUiType$1(this, continuationImpl);
        }
        Object objB = pickStopComponent$getLayoutUiType$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pickStopComponent$getLayoutUiType$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            int i3 = 0;
            if (!list.isEmpty()) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
                for (Object obj : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    ProductBookingStopDetails productBookingStopDetails = (ProductBookingStopDetails) obj;
                    ChaloTransitMode chaloTransitMode = ((PickStopDataState) this.f.getValue()).f8300a;
                    switch (chaloTransitMode == null ? -1 : WhenMappings.f8298a[chaloTransitMode.ordinal()]) {
                        case -1:
                        case 7:
                        case 8:
                            iconType = IconType.BUS_SEARCH;
                            break;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            iconType = IconType.METRO_SEARCH;
                            break;
                        case 2:
                            iconType = IconType.BUS_SEARCH;
                            break;
                        case 3:
                            iconType = IconType.TRAIN_SEARCH;
                            break;
                        case 4:
                            iconType = IconType.MONORAIL_SEARCH;
                            break;
                        case 5:
                            iconType = IconType.FERRY_SEARCH;
                            break;
                        case 6:
                            iconType = IconType.CAB_NEARBY;
                            break;
                    }
                    ImageUIState imageUIState = new ImageUIState(iconType, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254);
                    TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(productBookingStopDetails.b, UITextStyle.DisplaySmall, ChaloColorToken.Black.f9759a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8176);
                    String str = productBookingStopDetails.c;
                    if (str == null) {
                        chaloTextUIState = null;
                    } else {
                        String str2 = StringsKt.F(str) ? null : str;
                        if (str2 != null) {
                            chaloTextUIState = new TextUIState.ChaloTextUIState(str2, UITextStyle.BodyMedium, ChaloColorToken.Black_87.f9768a, 1, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8176);
                        } else {
                            chaloTextUIState = null;
                        }
                    }
                    arrayList.add(new StopItemUiState(imageUIState, chaloTextUIState2, chaloTextUIState, UiEventHandler.Companion.a(new fr0(5, this, productBookingStopDetails)), new ImageUIState(IconType.IC_ORANGE_ARROW_RIGHT, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), i3 < CollectionsKt.K(list) ? new DividerUIState(0.0f, null, null, 7) : null));
                    i3 = i4;
                }
                return new PickStopScreenLayoutUiType.StopList(arrayList);
            }
            pickStopComponent$getLayoutUiType$1.label = 1;
            objB = this.o.b(StringEnum.NO_ENTRIES_FOUND, new Object[0], pickStopComponent$getLayoutUiType$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        return new PickStopScreenLayoutUiType.NoList(new NoResultUiState(new TextUIState.ChaloTextUIState((String) objB, UITextStyle.BodyLarge, ChaloColorToken.Black_60.f9766a, 0, UITextAlign.Center, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8152)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object H0(ContinuationImpl continuationImpl) {
        PickStopComponent$getSearchBarUIState$1 pickStopComponent$getSearchBarUIState$1;
        String str;
        IconButtonUIState iconButtonUIState;
        if (continuationImpl instanceof PickStopComponent$getSearchBarUIState$1) {
            pickStopComponent$getSearchBarUIState$1 = (PickStopComponent$getSearchBarUIState$1) continuationImpl;
            int i = pickStopComponent$getSearchBarUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pickStopComponent$getSearchBarUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                pickStopComponent$getSearchBarUIState$1 = new PickStopComponent$getSearchBarUIState$1(this, continuationImpl);
            }
        } else {
            pickStopComponent$getSearchBarUIState$1 = new PickStopComponent$getSearchBarUIState$1(this, continuationImpl);
        }
        Object obj = pickStopComponent$getSearchBarUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = pickStopComponent$getSearchBarUIState$1.label;
        StateFlow stateFlow = this.f;
        if (i2 == 0) {
            ResultKt.b(obj);
            String str2 = ((PickStopDataState) stateFlow.getValue()).d;
            pickStopComponent$getSearchBarUIState$1.L$0 = str2;
            pickStopComponent$getSearchBarUIState$1.label = 1;
            Object objB = this.o.b(StringEnum.ENTER_STOP_SEARCH, new Object[0], pickStopComponent$getSearchBarUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str2;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) pickStopComponent$getSearchBarUIState$1.L$0;
            ResultKt.b(obj);
            str = str3;
        }
        UITextStyle uITextStyle = UITextStyle.BodyLarge;
        ChaloColorToken.ShadyGray shadyGray = ChaloColorToken.ShadyGray.f9851a;
        BaseTextFieldUIState.TextFieldUIState textFieldUIState = new BaseTextFieldUIState.TextFieldUIState(str, TextFieldEventHandlerHelper.b(2, new xr0(this, 0), null), null, null, new TextFieldLabelPlaceholderUIState.TextLabel(new TextUIState.ChaloTextUIState((String) obj, uITextStyle, shadyGray, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184)), null, false, null, 0, null, null, 0.0f, 131004);
        final int i3 = 0;
        IconButtonUIState iconButtonUIState2 = new IconButtonUIState(new ImageUIState(IconType.IC_ARROW_BACK_BLACK, (String) null, shadyGray, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 250), UiEventHandler.Companion.a(new Function0(this) { // from class: yr0
            public final /* synthetic */ PickStopComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        this.b.I0(PickStopIntent.BackButtonPressIntent.f8301a);
                        break;
                    default:
                        this.b.I0(PickStopIntent.ClearSearchTextFieldIntent.f8302a);
                        break;
                }
                return Unit.f17538a;
            }
        }), (ChaloColorToken) null, 0.0f, 28);
        if (((PickStopDataState) stateFlow.getValue()).d.length() > 0) {
            final int i4 = 1;
            iconButtonUIState = new IconButtonUIState(new ImageUIState(IconType.CLOSE_LOCATION_SEARCH, (String) null, (ChaloColorToken) null, (ImageUISize) null, (UIContentScale) null, 0.0f, (UiEventHandler) null, 254), UiEventHandler.Companion.a(new Function0(this) { // from class: yr0
                public final /* synthetic */ PickStopComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i4) {
                        case 0:
                            this.b.I0(PickStopIntent.BackButtonPressIntent.f8301a);
                            break;
                        default:
                            this.b.I0(PickStopIntent.ClearSearchTextFieldIntent.f8302a);
                            break;
                    }
                    return Unit.f17538a;
                }
            }), ChaloColorToken.Transparent.f9864a, ChaloThemeHelper.a().f1916a, 4);
        } else {
            iconButtonUIState = null;
        }
        return new SearchBarWithActionUIState(null, textFieldUIState, iconButtonUIState2, iconButtonUIState, null, 49);
    }

    public final void I0(PickStopIntent pickStopIntent) {
        Object objB;
        C0(pickStopIntent);
        boolean zEquals = pickStopIntent.equals(PickStopIntent.InitialIntent.f8303a);
        ContextScope contextScope = this.j;
        if (zEquals) {
            AnalyticsContractImplKt.b(this.p, "pick stop screen opened", Source.PRODUCT_BOOKING_SRC, null, false, 28);
            E0(new ir0(21));
            ChaloJson chaloJson = ChaloJson.f6455a;
            String str = this.k.e;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, new ArrayListSerializer(ProductBookingStopDetails.INSTANCE.serializer()));
            } catch (Exception unused) {
                objB = null;
            }
            List list = (List) objB;
            if (list == null) {
                list = EmptyList.f17557a;
            }
            this.q = list;
            BuildersKt.d(contextScope, null, null, new PickStopComponent$handleInitialIntent$2(this, null), 3);
            return;
        }
        if (pickStopIntent instanceof PickStopIntent.SearchAndLoadStopListIntent) {
            PickStopIntent.SearchAndLoadStopListIntent searchAndLoadStopListIntent = (PickStopIntent.SearchAndLoadStopListIntent) pickStopIntent;
            E0(new ym0(searchAndLoadStopListIntent, 26));
            BuildersKt.d(contextScope, null, null, new PickStopComponent$handleSearchAndLoadStopListIntent$2(this, searchAndLoadStopListIntent, null), 3);
        } else if (pickStopIntent instanceof PickStopIntent.SelectStopIntent) {
            BuildersKt.d(contextScope, null, null, new PickStopComponent$handleSelectStopIntent$1(this, (PickStopIntent.SelectStopIntent) pickStopIntent, null), 3);
        } else if (pickStopIntent.equals(PickStopIntent.BackButtonPressIntent.f8301a)) {
            gf.u(null, this.n);
        } else {
            if (!pickStopIntent.equals(PickStopIntent.ClearSearchTextFieldIntent.f8302a)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new xr0(this, 1));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new PickStopDataState(null, false, EmptyList.f17557a, "");
    }
}
