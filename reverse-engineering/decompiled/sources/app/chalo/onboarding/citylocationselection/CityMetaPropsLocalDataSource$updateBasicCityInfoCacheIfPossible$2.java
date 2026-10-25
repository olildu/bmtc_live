package app.chalo.onboarding.citylocationselection;

import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.network.config.ChaloJson;
import app.chalo.onboarding.converters.CityResponseConverter;
import defpackage.q4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElementKt;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/models/BasicCityInfoAppModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$updateBasicCityInfoCacheIfPossible$2", f = "CityMetaPropsLocalDataSource.kt", l = {EACTags.ANSWER_TO_RESET}, m = "invokeSuspend", v = 1)
final class CityMetaPropsLocalDataSource$updateBasicCityInfoCacheIfPossible$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends BasicCityInfoAppModel>>, Object> {
    final /* synthetic */ String $basicCityInfoListJSONString;
    Object L$0;
    int label;
    final /* synthetic */ CityMetaPropsLocalDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityMetaPropsLocalDataSource$updateBasicCityInfoCacheIfPossible$2(String str, CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource, Continuation continuation) {
        super(2, continuation);
        this.$basicCityInfoListJSONString = str;
        this.this$0 = cityMetaPropsLocalDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityMetaPropsLocalDataSource$updateBasicCityInfoCacheIfPossible$2(this.$basicCityInfoListJSONString, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityMetaPropsLocalDataSource$updateBasicCityInfoCacheIfPossible$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) this.L$0;
                ResultKt.b(obj);
                return list;
            }
            ResultKt.b(obj);
            JsonArray jsonArrayF = JsonElementKt.f(ChaloJson.b.f(this.$basicCityInfoListJSONString));
            CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource = this.this$0;
            ArrayList arrayListA = CityResponseConverter.a(jsonArrayF);
            cityMetaPropsLocalDataSource.getClass();
            List listV0 = CollectionsKt.v0(new q4(3), arrayListA);
            CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource2 = this.this$0;
            String str = this.$basicCityInfoListJSONString;
            this.L$0 = listV0;
            this.label = 1;
            return cityMetaPropsLocalDataSource2.d("key_basic_city_info_list", str, this) == coroutineSingletons ? coroutineSingletons : listV0;
        } catch (Exception unused) {
            return null;
        }
    }
}
