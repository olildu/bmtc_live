package app.chalo.livetracking.frameworklivetracking.data.model;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.ul;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse;", "", "Companion", InitializationStatus.SUCCESS, "Error", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse$Error;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse$Success;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class ChaloSocketResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4243a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(1));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<ChaloSocketResponse> serializer() {
            return (KSerializer) ChaloSocketResponse.f4243a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse$Success;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Success extends ChaloSocketResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;
        public final Integer c;
        public final JsonObject d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse$Success$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Success> serializer() {
                return ChaloSocketResponse$Success$$serializer.f4245a;
            }
        }

        public /* synthetic */ Success(int i, String str, Integer num, JsonObject jsonObject) {
            if (5 != (i & 5)) {
                PluginExceptionsKt.b(ChaloSocketResponse$Success$$serializer.f4245a.getDescriptor(), i, 5);
                throw null;
            }
            this.b = str;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
            this.d = jsonObject;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.d(this.b, success.b) && Intrinsics.d(this.c, success.c) && Intrinsics.d(this.d, success.d);
        }

        public final int hashCode() {
            String str = this.b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.c;
            return this.d.f18198a.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Success(ref=" + this.b + ", requestId=" + this.c + ", res=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse$Error;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse;", "Companion", "$serializer", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Error extends ChaloSocketResponse {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new ul(2)), null};
        public final ChaloSocketResponseErrorType b;
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse$Error$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/livetracking/frameworklivetracking/data/model/ChaloSocketResponse$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Error> serializer() {
                return ChaloSocketResponse$Error$$serializer.f4244a;
            }
        }

        public /* synthetic */ Error(int i, ChaloSocketResponseErrorType chaloSocketResponseErrorType, String str) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(ChaloSocketResponse$Error$$serializer.f4244a.getDescriptor(), i, 1);
                throw null;
            }
            this.b = chaloSocketResponseErrorType;
            if ((i & 2) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.d(this.b, error.b) && Intrinsics.d(this.c, error.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Error(errorType=" + this.b + ", errorMsg=" + this.c + ")";
        }

        public Error(ChaloSocketResponseErrorType errorType, String str) {
            Intrinsics.i(errorType, "errorType");
            this.b = errorType;
            this.c = str;
        }
    }
}
