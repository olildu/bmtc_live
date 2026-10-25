package app.chalo.ridefeedback.domain;

import app.chalo.utils.ConcurrentMutableMap;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.NonCancellable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ridefeedback/domain/RideFeedbackSubmissionGate;", "", "SubmissionKey", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RideFeedbackSubmissionGate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentMutableMap f9088a = new ConcurrentMutableMap();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ridefeedback/domain/RideFeedbackSubmissionGate$SubmissionKey;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SubmissionKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f9089a;
        public final String b;
        public final String c;

        public SubmissionKey(String bookingId, String userId, String str) {
            Intrinsics.i(bookingId, "bookingId");
            Intrinsics.i(userId, "userId");
            this.f9089a = bookingId;
            this.b = userId;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubmissionKey)) {
                return false;
            }
            SubmissionKey submissionKey = (SubmissionKey) obj;
            return Intrinsics.d(this.f9089a, submissionKey.f9089a) && Intrinsics.d(this.b, submissionKey.b) && Intrinsics.d(this.c, submissionKey.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + nf1.e(this.f9089a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return vo1.p(dd.e("SubmissionKey(bookingId=", this.f9089a, ", userId=", this.b, ", cityId="), this.c, ")");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        RideFeedbackSubmissionGate$claim$1 rideFeedbackSubmissionGate$claim$1;
        if (continuationImpl instanceof RideFeedbackSubmissionGate$claim$1) {
            rideFeedbackSubmissionGate$claim$1 = (RideFeedbackSubmissionGate$claim$1) continuationImpl;
            int i = rideFeedbackSubmissionGate$claim$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackSubmissionGate$claim$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackSubmissionGate$claim$1 = new RideFeedbackSubmissionGate$claim$1(this, continuationImpl);
            }
        } else {
            rideFeedbackSubmissionGate$claim$1 = new RideFeedbackSubmissionGate$claim$1(this, continuationImpl);
        }
        Object objD = rideFeedbackSubmissionGate$claim$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackSubmissionGate$claim$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            String lowerCase = str3.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            SubmissionKey submissionKey = new SubmissionKey(str, str2, lowerCase);
            rideFeedbackSubmissionGate$claim$1.label = 1;
            objD = this.f9088a.d(submissionKey, Unit.f17538a, rideFeedbackSubmissionGate$claim$1);
            if (objD == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
        }
        return Boolean.valueOf(objD == null);
    }

    public final Object b(List list, Continuation continuation) throws Throwable {
        Object objG = BuildersKt.g(NonCancellable.f17739a, new RideFeedbackSubmissionGate$releaseAll$2(list, this, null), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object c(String str, String str2, String str3, Function1 function1, ContinuationImpl continuationImpl) throws Throwable {
        RideFeedbackSubmissionGate$withClaim$1 rideFeedbackSubmissionGate$withClaim$1;
        Function1 function2;
        String str4;
        Throwable th;
        String str5;
        String str6;
        Object obj;
        String str7;
        NonCancellable nonCancellable;
        RideFeedbackSubmissionGate$withClaim$2 rideFeedbackSubmissionGate$withClaim$2;
        NonCancellable nonCancellable2;
        RideFeedbackSubmissionGate$withClaim$2 rideFeedbackSubmissionGate$withClaim$3;
        String str8 = str2;
        String str9 = str3;
        if (continuationImpl instanceof RideFeedbackSubmissionGate$withClaim$1) {
            rideFeedbackSubmissionGate$withClaim$1 = (RideFeedbackSubmissionGate$withClaim$1) continuationImpl;
            int i = rideFeedbackSubmissionGate$withClaim$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rideFeedbackSubmissionGate$withClaim$1.label = i - Integer.MIN_VALUE;
            } else {
                rideFeedbackSubmissionGate$withClaim$1 = new RideFeedbackSubmissionGate$withClaim$1(this, continuationImpl);
            }
        } else {
            rideFeedbackSubmissionGate$withClaim$1 = new RideFeedbackSubmissionGate$withClaim$1(this, continuationImpl);
        }
        RideFeedbackSubmissionGate$withClaim$1 rideFeedbackSubmissionGate$withClaim$4 = rideFeedbackSubmissionGate$withClaim$1;
        Object obj2 = rideFeedbackSubmissionGate$withClaim$4.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = rideFeedbackSubmissionGate$withClaim$4.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            rideFeedbackSubmissionGate$withClaim$4.L$0 = str;
            rideFeedbackSubmissionGate$withClaim$4.L$1 = str8;
            rideFeedbackSubmissionGate$withClaim$4.L$2 = str9;
            rideFeedbackSubmissionGate$withClaim$4.L$3 = function1;
            rideFeedbackSubmissionGate$withClaim$4.label = 1;
            Object objA = a(str, str8, str9, rideFeedbackSubmissionGate$withClaim$4);
            if (objA != obj3) {
                function2 = function1;
                obj2 = objA;
                str4 = str;
            }
            return obj3;
        }
        if (i2 == 1) {
            function2 = (Function1) rideFeedbackSubmissionGate$withClaim$4.L$3;
            String str10 = (String) rideFeedbackSubmissionGate$withClaim$4.L$2;
            String str11 = (String) rideFeedbackSubmissionGate$withClaim$4.L$1;
            str4 = (String) rideFeedbackSubmissionGate$withClaim$4.L$0;
            ResultKt.b(obj2);
            str9 = str10;
            str8 = str11;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    Object obj4 = rideFeedbackSubmissionGate$withClaim$4.L$0;
                    ResultKt.b(obj2);
                    return obj4;
                }
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) rideFeedbackSubmissionGate$withClaim$4.L$0;
                ResultKt.b(obj2);
                throw th2;
            }
            String str12 = (String) rideFeedbackSubmissionGate$withClaim$4.L$2;
            str6 = (String) rideFeedbackSubmissionGate$withClaim$4.L$1;
            str4 = (String) rideFeedbackSubmissionGate$withClaim$4.L$0;
            try {
                ResultKt.b(obj2);
                obj = obj2;
                str7 = str12;
                String str13 = str4;
                nonCancellable2 = NonCancellable.f17739a;
                rideFeedbackSubmissionGate$withClaim$3 = new RideFeedbackSubmissionGate$withClaim$2(this, str13, str6, str7, null);
                rideFeedbackSubmissionGate$withClaim$4.L$0 = obj;
                rideFeedbackSubmissionGate$withClaim$4.L$1 = null;
                rideFeedbackSubmissionGate$withClaim$4.L$2 = null;
                rideFeedbackSubmissionGate$withClaim$4.label = 3;
                if (BuildersKt.g(nonCancellable2, rideFeedbackSubmissionGate$withClaim$3, rideFeedbackSubmissionGate$withClaim$4) != obj3) {
                    return obj3;
                }
                return obj;
            } catch (Throwable th3) {
                th = th3;
                str5 = str12;
                String str14 = str4;
                nonCancellable = NonCancellable.f17739a;
                rideFeedbackSubmissionGate$withClaim$2 = new RideFeedbackSubmissionGate$withClaim$2(this, str14, str6, str5, null);
                rideFeedbackSubmissionGate$withClaim$4.L$0 = th;
                rideFeedbackSubmissionGate$withClaim$4.L$1 = null;
                rideFeedbackSubmissionGate$withClaim$4.L$2 = null;
                rideFeedbackSubmissionGate$withClaim$4.L$3 = null;
                rideFeedbackSubmissionGate$withClaim$4.label = 4;
                if (BuildersKt.g(nonCancellable, rideFeedbackSubmissionGate$withClaim$2, rideFeedbackSubmissionGate$withClaim$4) != obj3) {
                    throw th;
                }
            }
        }
        if (!((Boolean) obj2).booleanValue()) {
            return null;
        }
        try {
            rideFeedbackSubmissionGate$withClaim$4.L$0 = str4;
            rideFeedbackSubmissionGate$withClaim$4.L$1 = str8;
            rideFeedbackSubmissionGate$withClaim$4.L$2 = str9;
            rideFeedbackSubmissionGate$withClaim$4.L$3 = null;
            rideFeedbackSubmissionGate$withClaim$4.label = 2;
            Object objInvoke = function2.invoke(rideFeedbackSubmissionGate$withClaim$4);
            if (objInvoke != obj3) {
                obj = objInvoke;
                str7 = str9;
                str6 = str8;
                String str15 = str4;
                nonCancellable2 = NonCancellable.f17739a;
                rideFeedbackSubmissionGate$withClaim$3 = new RideFeedbackSubmissionGate$withClaim$2(this, str15, str6, str7, null);
                rideFeedbackSubmissionGate$withClaim$4.L$0 = obj;
                rideFeedbackSubmissionGate$withClaim$4.L$1 = null;
                rideFeedbackSubmissionGate$withClaim$4.L$2 = null;
                rideFeedbackSubmissionGate$withClaim$4.label = 3;
                if (BuildersKt.g(nonCancellable2, rideFeedbackSubmissionGate$withClaim$3, rideFeedbackSubmissionGate$withClaim$4) != obj3) {
                    return obj;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            str5 = str9;
            str6 = str8;
            String str16 = str4;
            nonCancellable = NonCancellable.f17739a;
            rideFeedbackSubmissionGate$withClaim$2 = new RideFeedbackSubmissionGate$withClaim$2(this, str16, str6, str5, null);
            rideFeedbackSubmissionGate$withClaim$4.L$0 = th;
            rideFeedbackSubmissionGate$withClaim$4.L$1 = null;
            rideFeedbackSubmissionGate$withClaim$4.L$2 = null;
            rideFeedbackSubmissionGate$withClaim$4.L$3 = null;
            rideFeedbackSubmissionGate$withClaim$4.label = 4;
            if (BuildersKt.g(nonCancellable, rideFeedbackSubmissionGate$withClaim$2, rideFeedbackSubmissionGate$withClaim$4) != obj3) {
                throw th;
            }
        }
        return obj3;
    }
}
