package app.chalo.ncmc.uvik;

import com.inmobi.unification.sdk.InitializationStatus;
import defpackage.cb0;
import defpackage.r30;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikResult;", "", "Failure", InitializationStatus.SUCCESS, "Lapp/chalo/ncmc/uvik/UvikResult$Failure;", "Lapp/chalo/ncmc/uvik/UvikResult$Success;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class UvikResult {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikResult$Failure;", "Lapp/chalo/ncmc/uvik/UvikResult;", "ResultUnavailable", "Result", "Lapp/chalo/ncmc/uvik/UvikResult$Failure$Result;", "Lapp/chalo/ncmc/uvik/UvikResult$Failure$ResultUnavailable;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Failure extends UvikResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6444a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikResult$Failure$Result;", "Lapp/chalo/ncmc/uvik/UvikResult$Failure;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Result extends Failure {
            public final String b;
            public final String c;

            public Result(String str, String str2) {
                super(str);
                this.b = str;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result)) {
                    return false;
                }
                Result result = (Result) obj;
                return Intrinsics.d(this.b, result.b) && Intrinsics.d(this.c, result.c);
            }

            public final int hashCode() {
                String str = this.b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.c;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return vo1.o("Result(code=", this.b, ", msg=", this.c, ")");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikResult$Failure$ResultUnavailable;", "Lapp/chalo/ncmc/uvik/UvikResult$Failure;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ResultUnavailable extends Failure {
            public final String b;

            public ResultUnavailable(String str) {
                super(null);
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ResultUnavailable) && Intrinsics.d(this.b, ((ResultUnavailable) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return vo1.B("ResultUnavailable(msg=", this.b, ")");
            }
        }

        public Failure(String str) {
            this.f6444a = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ncmc/uvik/UvikResult$Success;", "Lapp/chalo/ncmc/uvik/UvikResult;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends UvikResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UvikTransactionStatus f6445a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;

        public Success(UvikTransactionStatus status, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            Intrinsics.i(status, "status");
            this.f6445a = status;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = str9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return this.f6445a == success.f6445a && Intrinsics.d(this.b, success.b) && Intrinsics.d(this.c, success.c) && Intrinsics.d(this.d, success.d) && Intrinsics.d(this.e, success.e) && Intrinsics.d(this.f, success.f) && Intrinsics.d(this.g, success.g) && Intrinsics.d(this.h, success.h) && Intrinsics.d(this.i, success.i) && Intrinsics.d(this.j, success.j);
        }

        public final int hashCode() {
            int iHashCode = this.f6445a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.g;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.h;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.i;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.j;
            return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(status=");
            sb.append(this.f6445a);
            sb.append(", code=");
            sb.append(this.b);
            sb.append(", msg=");
            cb0.t(sb, this.c, ", uvikTransactionId=", this.d, ", rrn=");
            cb0.t(sb, this.e, ", offlineBalance=", this.f, ", topUpAmount=");
            cb0.t(sb, this.g, ", invoiceNumber=", this.h, ", dateAndTime=");
            return r30.i(sb, this.i, ", maskedCardNumber=", this.j, ")");
        }
    }
}
