package app.chalo.onboarding.citylocationselection.ui;

import app.chalo.constants.Source;
import app.chalo.network.config.ChaloJson;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.universalsearch.data.UniversalSearchOptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$navigateToUniversalSearch$2$1$1", f = "CityLocationSelectionComponent.kt", l = {1020}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$navigateToUniversalSearch$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    final /* synthetic */ UniversalSearchOptions $searchOptions;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$navigateToUniversalSearch$2$1$1(CityLocationSelectionComponent cityLocationSelectionComponent, UniversalSearchOptions universalSearchOptions, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cityLocationSelectionComponent;
        this.$searchOptions = universalSearchOptions;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityLocationSelectionComponent$navigateToUniversalSearch$2$1$1(this.this$0, this.$searchOptions, this.$requestId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$navigateToUniversalSearch$2$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strA;
        ChaloNavigationManager chaloNavigationManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloNavigationManager chaloNavigationManager2 = this.this$0.v;
            Json json = ChaloJson.b;
            UniversalSearchOptions universalSearchOptions = this.$searchOptions;
            json.getClass();
            strA = json.a(UniversalSearchOptions.INSTANCE.serializer(), universalSearchOptions);
            this.L$0 = strA;
            this.L$1 = chaloNavigationManager2;
            this.label = 1;
            Object objB = this.this$0.o.b(StringEnum.CITY_LOCATION_SEARCH_PLACEHOLDER, new Object[0], this);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            chaloNavigationManager = chaloNavigationManager2;
            obj = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloNavigationManager = (ChaloNavigationManager) this.L$1;
            strA = (String) this.L$0;
            ResultKt.b(obj);
        }
        ChaloNavigationManagerKt.e(chaloNavigationManager, new UniversalPickerArgs(strA, (String) obj, UniversalSearchFlowSource.CITY_SELECTION.getSourceName(), Source.CITY_SELECTION_SCREEN, (String) null, "CITY_LOCATION_SEARCH", this.$requestId, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1936), null, 6);
        return Unit.f17538a;
    }
}
