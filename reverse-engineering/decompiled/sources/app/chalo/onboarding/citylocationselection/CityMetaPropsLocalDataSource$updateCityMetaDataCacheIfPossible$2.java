package app.chalo.onboarding.citylocationselection;

import androidx.compose.ui.spatial.RectListKt;
import app.chalo.network.config.ChaloJson;
import app.chalo.onboarding.converters.CityResponseConverter;
import app.chalo.providers.cityprovider.impl.data.mappers.MetaDataPropsApiToAppMappersKt;
import app.chalo.providers.cityprovider.impl.data.models.api.MetaDataPropsCityResponseApiModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import defpackage.q4;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lapp/chalo/onboarding/citylocationselection/CityMetaDataCacheUpdateResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.CityMetaPropsLocalDataSource$updateCityMetaDataCacheIfPossible$2", f = "CityMetaPropsLocalDataSource.kt", l = {RectListKt.BitOffsetForGesturable, 63}, m = "invokeSuspend", v = 1)
final class CityMetaPropsLocalDataSource$updateCityMetaDataCacheIfPossible$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CityMetaDataCacheUpdateResult>, Object> {
    final /* synthetic */ String $basicCityInfoListJSONString;
    final /* synthetic */ String $cityId;
    final /* synthetic */ String $cityMetaPropsJSONString;
    Object L$0;
    int label;
    final /* synthetic */ CityMetaPropsLocalDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityMetaPropsLocalDataSource$updateCityMetaDataCacheIfPossible$2(String str, CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.$cityMetaPropsJSONString = str;
        this.this$0 = cityMetaPropsLocalDataSource;
        this.$cityId = str2;
        this.$basicCityInfoListJSONString = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CityMetaPropsLocalDataSource$updateCityMetaDataCacheIfPossible$2(this.$cityMetaPropsJSONString, this.this$0, this.$cityId, this.$basicCityInfoListJSONString, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityMetaPropsLocalDataSource$updateCityMetaDataCacheIfPossible$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        ArrayList arrayList;
        CityAppModel cityAppModel;
        CityAppModel cityAppModel2;
        Object next;
        CityAppModel cityAppModel3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    cityAppModel2 = (CityAppModel) this.L$0;
                    ResultKt.b(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cityAppModel3 = (CityAppModel) this.L$0;
                    ResultKt.b(obj);
                }
                return new CityMetaDataCacheUpdateResult.Success(cityAppModel3);
            }
            ResultKt.b(obj);
            ChaloJson chaloJson = ChaloJson.f6455a;
            String str = this.$cityMetaPropsJSONString;
            try {
                Json json = ChaloJson.b;
                json.getClass();
                objB = json.b(str, BuiltinSerializersKt.c(new ArrayListSerializer(MetaDataPropsCityResponseApiModel.INSTANCE.serializer())));
            } catch (Exception unused) {
                objB = null;
            }
            List list = (List) objB;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CityAppModel cityAppModelA = MetaDataPropsApiToAppMappersKt.a((MetaDataPropsCityResponseApiModel) it.next());
                    if (cityAppModelA != null) {
                        arrayList.add(cityAppModelA);
                    }
                }
            } else {
                arrayList = null;
            }
            this.this$0.getClass();
            List listV0 = arrayList == null ? null : CollectionsKt.v0(new q4(4), arrayList);
            if (listV0 != null) {
                String str2 = this.$cityId;
                Iterator it2 = listV0.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!StringsKt.x(((CityAppModel) next).f8854a, str2, true));
                cityAppModel = (CityAppModel) next;
            } else {
                cityAppModel = null;
            }
            if (cityAppModel == null) {
                return new CityMetaDataCacheUpdateResult.Failure("City not found in list", this.$cityId, listV0);
            }
            CityResponseConverter.a(JsonElementKt.f(ChaloJson.b.f(this.$basicCityInfoListJSONString)));
            CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource = this.this$0;
            String str3 = this.$cityMetaPropsJSONString;
            this.L$0 = cityAppModel;
            this.label = 1;
            if (cityMetaPropsLocalDataSource.d("key_city_meta_props", str3, this) != coroutineSingletons) {
                cityAppModel2 = cityAppModel;
            }
            return coroutineSingletons;
            CityMetaPropsLocalDataSource cityMetaPropsLocalDataSource2 = this.this$0;
            String str4 = this.$basicCityInfoListJSONString;
            this.L$0 = cityAppModel2;
            this.label = 2;
            if (cityMetaPropsLocalDataSource2.d("key_basic_city_info_list", str4, this) != coroutineSingletons) {
                cityAppModel3 = cityAppModel2;
                return new CityMetaDataCacheUpdateResult.Success(cityAppModel3);
            }
            return coroutineSingletons;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Something went wrong";
            }
            return new CityMetaDataCacheUpdateResult.Failure(message, this.$cityId, null);
        }
    }
}
