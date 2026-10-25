package app.chalo.metro.ui.landing;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import defpackage.li0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleUniversalSearchResultReceivedIntent$1", f = "MetroLandingScreenComponent.kt", l = {PsExtractor.VIDEO_STREAM_MASK, 252}, m = "invokeSuspend", v = 1)
final class MetroLandingScreenComponent$handleUniversalSearchResultReceivedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StopAppModel $stop;
    Object L$0;
    int label;
    final /* synthetic */ MetroLandingScreenComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5487a;

        static {
            int[] iArr = new int[PickStopRequestType.values().length];
            try {
                iArr[PickStopRequestType.FROM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PickStopRequestType.TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PickStopRequestType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5487a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroLandingScreenComponent$handleUniversalSearchResultReceivedIntent$1(MetroLandingScreenComponent metroLandingScreenComponent, StopAppModel stopAppModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = metroLandingScreenComponent;
        this.$stop = stopAppModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetroLandingScreenComponent$handleUniversalSearchResultReceivedIntent$1(this.this$0, this.$stop, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MetroLandingScreenComponent$handleUniversalSearchResultReceivedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MetroLandingScreenComponent metroLandingScreenComponent;
        MetroLandingScreenComponent metroLandingScreenComponent2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MetroLandingScreenDataState metroLandingScreenDataState = (MetroLandingScreenDataState) this.this$0.f.getValue();
            int i2 = WhenMappings.f5487a[((MetroLandingScreenDataState) this.this$0.f.getValue()).e.ordinal()];
            if (i2 == 1) {
                String str = this.$stop.f1727a;
                StopAppModel stopAppModel = metroLandingScreenDataState.l;
                if (Intrinsics.d(str, stopAppModel != null ? stopAppModel.f1727a : null)) {
                    MetroLandingScreenComponent metroLandingScreenComponent3 = this.this$0;
                    this.L$0 = metroLandingScreenComponent3;
                    this.label = 1;
                    Object objB = metroLandingScreenComponent3.l.b(StringEnum.ORIGIN_AND_DESTINATION_MUST_BE_DIFFERENT, new Object[0], this);
                    if (objB != coroutineSingletons) {
                        metroLandingScreenComponent = metroLandingScreenComponent3;
                        obj = objB;
                        MetroLandingScreenComponent.Q0(metroLandingScreenComponent, (String) obj);
                    }
                    return coroutineSingletons;
                }
                this.this$0.E0(new li0(2, this.$stop));
            } else if (i2 == 2) {
                String str2 = this.$stop.f1727a;
                StopAppModel stopAppModel2 = metroLandingScreenDataState.k;
                if (Intrinsics.d(str2, stopAppModel2 != null ? stopAppModel2.f1727a : null)) {
                    MetroLandingScreenComponent metroLandingScreenComponent4 = this.this$0;
                    this.L$0 = metroLandingScreenComponent4;
                    this.label = 2;
                    Object objB2 = metroLandingScreenComponent4.l.b(StringEnum.ORIGIN_AND_DESTINATION_MUST_BE_DIFFERENT, new Object[0], this);
                    if (objB2 != coroutineSingletons) {
                        metroLandingScreenComponent2 = metroLandingScreenComponent4;
                        obj = objB2;
                        MetroLandingScreenComponent.Q0(metroLandingScreenComponent2, (String) obj);
                    }
                    return coroutineSingletons;
                }
                this.this$0.E0(new li0(3, this.$stop));
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1) {
            metroLandingScreenComponent = (MetroLandingScreenComponent) this.L$0;
            ResultKt.b(obj);
            MetroLandingScreenComponent.Q0(metroLandingScreenComponent, (String) obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            metroLandingScreenComponent2 = (MetroLandingScreenComponent) this.L$0;
            ResultKt.b(obj);
            MetroLandingScreenComponent.Q0(metroLandingScreenComponent2, (String) obj);
        }
        return Unit.f17538a;
    }
}
