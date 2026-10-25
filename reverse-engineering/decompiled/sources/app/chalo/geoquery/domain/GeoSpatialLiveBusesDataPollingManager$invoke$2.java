package app.chalo.geoquery.domain;

import app.chalo.geoquery.data.models.app.GeoQueryBusInfoResponseAppModel;
import app.chalo.geoquery.data.models.app.GeoQueryCityConfigModel;
import app.chalo.location.LatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lapp/chalo/geoquery/data/models/app/GeoQueryBusInfoResponseAppModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager$invoke$2", f = "GeoSpatialLiveBusesDataPollingManager.kt", l = {61, 70, 72, 85}, m = "invokeSuspend", v = 1)
final class GeoSpatialLiveBusesDataPollingManager$invoke$2 extends SuspendLambda implements Function2<FlowCollector<? super List<? extends GeoQueryBusInfoResponseAppModel>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ GeoQueryCityConfigModel $cityConfig;
    final /* synthetic */ LatLng $latLng;
    final /* synthetic */ boolean $shouldFetchAdditionalInfoOnStart;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GeoSpatialLiveBusesDataPollingManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoSpatialLiveBusesDataPollingManager$invoke$2(boolean z, GeoQueryCityConfigModel geoQueryCityConfigModel, GeoSpatialLiveBusesDataPollingManager geoSpatialLiveBusesDataPollingManager, LatLng latLng, Continuation continuation) {
        super(2, continuation);
        this.$shouldFetchAdditionalInfoOnStart = z;
        this.$cityConfig = geoQueryCityConfigModel;
        this.this$0 = geoSpatialLiveBusesDataPollingManager;
        this.$latLng = latLng;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GeoSpatialLiveBusesDataPollingManager$invoke$2 geoSpatialLiveBusesDataPollingManager$invoke$2 = new GeoSpatialLiveBusesDataPollingManager$invoke$2(this.$shouldFetchAdditionalInfoOnStart, this.$cityConfig, this.this$0, this.$latLng, continuation);
        geoSpatialLiveBusesDataPollingManager$invoke$2.L$0 = obj;
        return geoSpatialLiveBusesDataPollingManager$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GeoSpatialLiveBusesDataPollingManager$invoke$2) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0090  */
    /* JADX WARN: Code duplicated, block: B:19:0x0096  */
    /* JADX WARN: Code duplicated, block: B:20:0x0099  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:30:0x010a  */
    /* JADX WARN: Code duplicated, block: B:33:0x011e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0123  */
    /* JADX WARN: Code duplicated, block: B:39:0x0132  */
    /* JADX WARN: Code duplicated, block: B:42:0x014b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0153  */
    /* JADX WARN: Code duplicated, block: B:45:0x0159  */
    /* JADX WARN: Code duplicated, block: B:47:0x015e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0170  */
    /* JADX WARN: Code duplicated, block: B:53:0x0179  */
    /* JADX WARN: Code duplicated, block: B:55:0x017c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0180  */
    /* JADX WARN: Code duplicated, block: B:58:0x0182  */
    /* JADX WARN: Code duplicated, block: B:61:0x018a  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c0 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01af, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r14, r22) == r9) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [int] */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13, types: [app.chalo.geoquery.domain.FetchGeoSpatialDataUseCase] */
    /* JADX WARN: Type inference failed for: r7v14, types: [boolean] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01af -> B:66:0x01b2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.geoquery.domain.GeoSpatialLiveBusesDataPollingManager$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
