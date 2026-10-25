package app.chalo.network;

import app.chalo.network.rest.generic.ChaloAuthConfigHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lapp/chalo/network/rest/generic/ChaloAuthConfigHandler$ChaloAuthSecureData;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.network.HttpClientHelper$setupChaloAuth$1$1$1", f = "HttpClientHelper.kt", l = {48, 50}, m = "invokeSuspend", v = 1)
final class HttpClientHelper$setupChaloAuth$1$1$1 extends SuspendLambda implements Function1<Continuation<? super ChaloAuthConfigHandler.ChaloAuthSecureData>, Object> {
    final /* synthetic */ ChaloAuthSecureManager $chaloAuthSecureManager;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpClientHelper$setupChaloAuth$1$1$1(ChaloAuthSecureManager chaloAuthSecureManager, Continuation continuation) {
        super(1, continuation);
        this.$chaloAuthSecureManager = chaloAuthSecureManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new HttpClientHelper$setupChaloAuth$1$1$1(this.$chaloAuthSecureManager, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((HttpClientHelper$setupChaloAuth$1$1$1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            ChaloAuthSecureManager chaloAuthSecureManager = this.$chaloAuthSecureManager;
            this.label = 1;
            obj = chaloAuthSecureManager.d(this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) this.L$1;
            str = (String) this.L$0;
            ResultKt.b(obj);
        }
        return new ChaloAuthConfigHandler.ChaloAuthSecureData(str, str2, (String) obj);
        str = (String) obj;
        this.$chaloAuthSecureManager.getClass();
        ChaloAuthSecureManager chaloAuthSecureManager2 = this.$chaloAuthSecureManager;
        this.L$0 = str;
        this.L$1 = "ACCESS_TOKEN";
        this.label = 2;
        obj = chaloAuthSecureManager2.b(this);
        if (obj != coroutineSingletons) {
            str2 = "ACCESS_TOKEN";
            return new ChaloAuthConfigHandler.ChaloAuthSecureData(str, str2, (String) obj);
        }
        return coroutineSingletons;
    }
}
