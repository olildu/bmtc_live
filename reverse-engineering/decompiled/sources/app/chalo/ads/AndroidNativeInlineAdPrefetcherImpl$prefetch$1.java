package app.chalo.ads;

import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.ads.AndroidNativeInlineAdPrefetcherImpl$prefetch$1", f = "AndroidNativeInlineAdPrefetcherImpl.kt", l = {78}, m = "invokeSuspend", v = 1)
final class AndroidNativeInlineAdPrefetcherImpl$prefetch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ CompletableDeferred<Unit> $deferred;
    final /* synthetic */ AndroidNativeInlineAdPrefetcherImpl.Key $key;
    final /* synthetic */ Map<String, String> $targetingSnapshot;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AndroidNativeInlineAdPrefetcherImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidNativeInlineAdPrefetcherImpl$prefetch$1(AndroidNativeInlineAdPrefetcherImpl.Key key, AndroidNativeInlineAdPrefetcherImpl androidNativeInlineAdPrefetcherImpl, String str, Map map, CompletableDeferred completableDeferred, Continuation continuation) {
        super(2, continuation);
        this.$key = key;
        this.this$0 = androidNativeInlineAdPrefetcherImpl;
        this.$adUnitId = str;
        this.$targetingSnapshot = map;
        this.$deferred = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AndroidNativeInlineAdPrefetcherImpl$prefetch$1 androidNativeInlineAdPrefetcherImpl$prefetch$1 = new AndroidNativeInlineAdPrefetcherImpl$prefetch$1(this.$key, this.this$0, this.$adUnitId, this.$targetingSnapshot, this.$deferred, continuation);
        androidNativeInlineAdPrefetcherImpl$prefetch$1.L$0 = obj;
        return androidNativeInlineAdPrefetcherImpl$prefetch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidNativeInlineAdPrefetcherImpl$prefetch$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x027f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0283  */
    /* JADX WARN: Code duplicated, block: B:112:0x028e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0292  */
    /* JADX WARN: Code duplicated, block: B:155:0x021d A[EXC_TOP_SPLITTER, PHI: r0
      0x021d: PHI (r0v32 com.google.android.gms.ads.nativead.NativeAd) = (r0v24 com.google.android.gms.ads.nativead.NativeAd), (r0v46 com.google.android.gms.ads.nativead.NativeAd) binds: [B:116:0x02ab, B:72:0x021b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0269 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0254 A[Catch: all -> 0x025a, TryCatch #6 {all -> 0x025a, blocks: (B:122:0x02b4, B:87:0x0239, B:89:0x0254, B:95:0x025e), top: B:159:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x025d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x02e3: IGET (r0 I:T) = (r12 I:kotlin.jvm.internal.Ref$ObjectRef) (LINE:740) kotlin.jvm.internal.Ref.ObjectRef.element java.lang.Object, block:B:139:0x02e3 */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r8v0, types: [int, kotlin.jvm.internal.Ref$BooleanRef] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        ?? r12;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef3;
        boolean z2;
        AndroidNativeInlineAdPrefetcherImpl androidNativeInlineAdPrefetcherImpl;
        Object obj2;
        AndroidNativeInlineAdPrefetcherImpl.Key key;
        CompletableDeferred<Unit> completableDeferred;
        boolean z3;
        T t;
        NativeAd nativeAd;
        T t2;
        boolean z4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r8 = this.label;
        try {
            if (r8 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                booleanRef = new Ref.BooleanRef();
                try {
                    NativeInlineAdTelemetry.a("prefetch_sdk_load_start", null, null, null, null, null, this.$key.a(), 124);
                    AndroidNativeInlineAdPrefetcherImpl androidNativeInlineAdPrefetcherImpl2 = this.this$0;
                    String str = this.$adUnitId;
                    Map<String, String> map = this.$targetingSnapshot;
                    this.L$0 = coroutineScope;
                    this.L$1 = objectRef3;
                    this.L$2 = booleanRef4;
                    this.L$3 = booleanRef;
                    this.L$4 = objectRef3;
                    this.label = 1;
                    Object objE = AndroidNativeInlineAdPrefetcherImpl.e(androidNativeInlineAdPrefetcherImpl2, str, map, this);
                    if (objE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objectRef2 = objectRef3;
                    booleanRef2 = booleanRef4;
                    objectRef = objectRef2;
                    t2 = objE;
                } catch (CancellationException e) {
                    e = e;
                    throw e;
                } catch (Throwable unused) {
                    objectRef = objectRef3;
                    booleanRef2 = booleanRef4;
                    booleanRef3 = booleanRef;
                    String message = "event=prefetch_unexpected_error " + this.$key.a();
                    Intrinsics.i(message, "message");
                    if (objectRef.element != 0 || booleanRef2.element) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    booleanRef3.element = z2;
                    androidNativeInlineAdPrefetcherImpl = this.this$0;
                    obj2 = androidNativeInlineAdPrefetcherImpl.c;
                    key = this.$key;
                    CompletableDeferred<Unit> completableDeferred2 = this.$deferred;
                    synchronized (obj2) {
                        completableDeferred = (CompletableDeferred) androidNativeInlineAdPrefetcherImpl.d.get(key);
                        if (completableDeferred == null && completableDeferred == completableDeferred2) {
                            androidNativeInlineAdPrefetcherImpl.d.remove(key);
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        this.$deferred.complete(Unit.f17538a);
                    }
                    if (booleanRef3.element) {
                        t = objectRef.element;
                        if (t != 0) {
                            NativeInlineAdTelemetry.a("prefetch_destroy_loaded_ad", null, null, null, null, (NativeAd) t, this.$key.a(), 60);
                        }
                        nativeAd = (NativeAd) objectRef.element;
                        if (nativeAd != null) {
                            try {
                                nativeAd.destroy();
                            } catch (Throwable th) {
                                ResultKt.a(th);
                            }
                        }
                    }
                    return Unit.f17538a;
                }
            } else {
                if (r8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) this.L$4;
                booleanRef3 = (Ref.BooleanRef) this.L$3;
                booleanRef2 = (Ref.BooleanRef) this.L$2;
                objectRef = (Ref.ObjectRef) this.L$1;
                try {
                    ResultKt.b(obj);
                    booleanRef = booleanRef3;
                    t2 = obj;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused2) {
                    String message2 = "event=prefetch_unexpected_error " + this.$key.a();
                    Intrinsics.i(message2, "message");
                    if (objectRef.element != 0) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    booleanRef3.element = z2;
                    androidNativeInlineAdPrefetcherImpl = this.this$0;
                    obj2 = androidNativeInlineAdPrefetcherImpl.c;
                    key = this.$key;
                    CompletableDeferred<Unit> completableDeferred3 = this.$deferred;
                    synchronized (obj2) {
                        completableDeferred = (CompletableDeferred) androidNativeInlineAdPrefetcherImpl.d.get(key);
                        if (completableDeferred == null) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            this.$deferred.complete(Unit.f17538a);
                        }
                        if (booleanRef3.element) {
                            t = objectRef.element;
                            if (t != 0) {
                                NativeInlineAdTelemetry.a("prefetch_destroy_loaded_ad", null, null, null, null, (NativeAd) t, this.$key.a(), 60);
                            }
                            nativeAd = (NativeAd) objectRef.element;
                            if (nativeAd != null) {
                            }
                        }
                        return Unit.f17538a;
                    }
                }
            }
            try {
                objectRef2.element = t2;
                AndroidNativeInlineAdPrefetcherImpl androidNativeInlineAdPrefetcherImpl3 = this.this$0;
                Object obj3 = androidNativeInlineAdPrefetcherImpl3.c;
                AndroidNativeInlineAdPrefetcherImpl.Key key2 = this.$key;
                CompletableDeferred<Unit> completableDeferred4 = this.$deferred;
                synchronized (obj3) {
                    try {
                        CompletableDeferred<Unit> completableDeferred5 = (CompletableDeferred) androidNativeInlineAdPrefetcherImpl3.d.get(key2);
                        if (completableDeferred5 == null || completableDeferred5 != completableDeferred4) {
                            if (objectRef.element != 0) {
                                NativeInlineAdTelemetry.a("prefetch_sdk_load_done", null, null, null, null, null, "dropped=true " + key2.a(), 124);
                            } else {
                                NativeInlineAdTelemetry.a("prefetch_sdk_load_done", null, null, null, null, null, "success=false dropped=true " + key2.a(), 124);
                            }
                            booleanRef.element = objectRef.element != 0;
                        } else {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            AdPrefetchStore adPrefetchStore = androidNativeInlineAdPrefetcherImpl3.f;
                            adPrefetchStore.getClass();
                            Intrinsics.i(key2, "key");
                            adPrefetchStore.b(jCurrentTimeMillis);
                            boolean zContainsKey = adPrefetchStore.c.containsKey(key2);
                            Object obj4 = objectRef.element;
                            if (obj4 != null && !zContainsKey) {
                                androidNativeInlineAdPrefetcherImpl3.f.c(jCurrentTimeMillis, key2, obj4);
                                booleanRef2.element = true;
                                NativeInlineAdTelemetry.a("prefetch_ready", null, null, null, null, (NativeAd) objectRef.element, key2.a() + " storeSize=" + androidNativeInlineAdPrefetcherImpl3.f.c.size(), 60);
                            } else if (obj4 != null && zContainsKey) {
                                NativeInlineAdTelemetry.a("prefetch_sdk_load_done", null, null, null, null, null, "success=true discarded_reason=already_ready " + key2.a(), 124);
                            } else if (obj4 != null) {
                                NativeInlineAdTelemetry.a("prefetch_sdk_load_done", null, null, null, null, null, "success=true discarded_reason=unknown " + key2.a(), 124);
                            } else {
                                NativeInlineAdTelemetry.a("prefetch_sdk_load_done", null, null, null, null, null, "success=false " + key2.a(), 124);
                            }
                            booleanRef.element = (objectRef.element == 0 || booleanRef2.element) ? false : true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                AndroidNativeInlineAdPrefetcherImpl androidNativeInlineAdPrefetcherImpl4 = this.this$0;
                Object obj5 = androidNativeInlineAdPrefetcherImpl4.c;
                AndroidNativeInlineAdPrefetcherImpl.Key key3 = this.$key;
                CompletableDeferred<Unit> completableDeferred6 = this.$deferred;
                synchronized (obj5) {
                    CompletableDeferred<Unit> completableDeferred7 = (CompletableDeferred) androidNativeInlineAdPrefetcherImpl4.d.get(key3);
                    if (completableDeferred7 == null || completableDeferred7 != completableDeferred6) {
                        z4 = false;
                    } else {
                        androidNativeInlineAdPrefetcherImpl4.d.remove(key3);
                        z4 = true;
                    }
                }
                if (z4) {
                    this.$deferred.complete(Unit.f17538a);
                }
                if (booleanRef.element) {
                    T t3 = objectRef.element;
                    if (t3 != 0) {
                        NativeInlineAdTelemetry.a("prefetch_destroy_loaded_ad", null, null, null, null, (NativeAd) t3, this.$key.a(), 60);
                    }
                    nativeAd = (NativeAd) objectRef.element;
                    if (nativeAd != null) {
                        nativeAd.destroy();
                    }
                }
            } catch (CancellationException e3) {
                e = e3;
                throw e;
            } catch (Throwable unused3) {
                booleanRef3 = booleanRef;
                String message3 = "event=prefetch_unexpected_error " + this.$key.a();
                Intrinsics.i(message3, "message");
                if (objectRef.element != 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                booleanRef3.element = z2;
                androidNativeInlineAdPrefetcherImpl = this.this$0;
                obj2 = androidNativeInlineAdPrefetcherImpl.c;
                key = this.$key;
                CompletableDeferred<Unit> completableDeferred8 = this.$deferred;
                synchronized (obj2) {
                    completableDeferred = (CompletableDeferred) androidNativeInlineAdPrefetcherImpl.d.get(key);
                    if (completableDeferred == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        this.$deferred.complete(Unit.f17538a);
                    }
                    if (booleanRef3.element) {
                        t = objectRef.element;
                        if (t != 0) {
                            NativeInlineAdTelemetry.a("prefetch_destroy_loaded_ad", null, null, null, null, (NativeAd) t, this.$key.a(), 60);
                        }
                        nativeAd = (NativeAd) objectRef.element;
                        if (nativeAd != null) {
                        }
                    }
                    return Unit.f17538a;
                }
            }
            return Unit.f17538a;
        } catch (Throwable th3) {
            AndroidNativeInlineAdPrefetcherImpl androidNativeInlineAdPrefetcherImpl5 = this.this$0;
            Object obj6 = androidNativeInlineAdPrefetcherImpl5.c;
            AndroidNativeInlineAdPrefetcherImpl.Key key4 = this.$key;
            CompletableDeferred<Unit> completableDeferred9 = this.$deferred;
            synchronized (obj6) {
                CompletableDeferred<Unit> completableDeferred10 = (CompletableDeferred) androidNativeInlineAdPrefetcherImpl5.d.get(key4);
                if (completableDeferred10 == null || completableDeferred10 != completableDeferred9) {
                    z = false;
                } else {
                    androidNativeInlineAdPrefetcherImpl5.d.remove(key4);
                    z = true;
                }
                if (z) {
                    this.$deferred.complete(Unit.f17538a);
                }
                if (!r8.element) {
                    throw th3;
                }
                T t4 = r12.element;
                if (t4 != 0) {
                    NativeInlineAdTelemetry.a("prefetch_destroy_loaded_ad", null, null, null, null, (NativeAd) t4, this.$key.a(), 60);
                }
                NativeAd nativeAd2 = (NativeAd) r12.element;
                if (nativeAd2 == null) {
                    throw th3;
                }
                try {
                    nativeAd2.destroy();
                    throw th3;
                } catch (Throwable th4) {
                    ResultKt.a(th4);
                    throw th3;
                }
            }
        }
    }
}
