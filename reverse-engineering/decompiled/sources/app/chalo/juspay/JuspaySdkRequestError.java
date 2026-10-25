package app.chalo.juspay;

import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/juspay/JuspaySdkRequestError;", "", "Local", "Api", "ResponseParsing", "InvalidData", "Unknown", "Lapp/chalo/juspay/JuspaySdkRequestError$Api;", "Lapp/chalo/juspay/JuspaySdkRequestError$InvalidData;", "Lapp/chalo/juspay/JuspaySdkRequestError$Local;", "Lapp/chalo/juspay/JuspaySdkRequestError$ResponseParsing;", "Lapp/chalo/juspay/JuspaySdkRequestError$Unknown;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class JuspaySdkRequestError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4068a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkRequestError$Api;", "Lapp/chalo/juspay/JuspaySdkRequestError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Api extends JuspaySdkRequestError {
        public final String b;
        public final Integer c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(String msg, Integer num) {
            super(msg, 0);
            Intrinsics.i(msg, "msg");
            this.b = msg;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Api)) {
                return false;
            }
            Api api = (Api) obj;
            return Intrinsics.d(this.b, api.b) && Intrinsics.d(this.c, api.c);
        }

        public final int hashCode() {
            int iHashCode = this.b.hashCode() * 31;
            Integer num = this.c;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "Api(msg=" + this.b + ", errorCode=" + this.c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkRequestError$InvalidData;", "Lapp/chalo/juspay/JuspaySdkRequestError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InvalidData extends JuspaySdkRequestError {
        public final String b;

        public InvalidData(String str) {
            super(str, 0);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InvalidData) && Intrinsics.d(this.b, ((InvalidData) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("InvalidData(msg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkRequestError$Local;", "Lapp/chalo/juspay/JuspaySdkRequestError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Local extends JuspaySdkRequestError {
        public final String b;

        public Local(String str) {
            super(str, 0);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Local) && Intrinsics.d(this.b, ((Local) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("Local(msg=", this.b, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkRequestError$ResponseParsing;", "Lapp/chalo/juspay/JuspaySdkRequestError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResponseParsing extends JuspaySdkRequestError {
        public static final ResponseParsing b = new ResponseParsing("Something went wrong while parsing response", 0);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResponseParsing);
        }

        public final int hashCode() {
            return -96657182;
        }

        public final String toString() {
            return "ResponseParsing";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/juspay/JuspaySdkRequestError$Unknown;", "Lapp/chalo/juspay/JuspaySdkRequestError;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Unknown extends JuspaySdkRequestError {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        public final int hashCode() {
            return 1033885479;
        }

        public final String toString() {
            return "Unknown(msg=Something went wrong)";
        }
    }

    public JuspaySdkRequestError(String str, int i) {
        this.f4068a = str;
    }
}
