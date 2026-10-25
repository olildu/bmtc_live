package app.chalo.utils;

import app.chalo.providers.stringprovider.StringEnum;
import defpackage.b3;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/utils/StringResourcesBase;", "", "GenericErrorMsg", "GenericErrorMsgWithErrorCode", "Lapp/chalo/utils/StringResourcesBase$GenericErrorMsg;", "Lapp/chalo/utils/StringResourcesBase$GenericErrorMsgWithErrorCode;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StringResourcesBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10441a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/StringResourcesBase$GenericErrorMsg;", "Lapp/chalo/utils/StringResourcesBase;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class GenericErrorMsg extends StringResourcesBase {
        static {
            StringEnum stringEnum = StringEnum._AMOUNT;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/StringResourcesBase$GenericErrorMsgWithErrorCode;", "Lapp/chalo/utils/StringResourcesBase;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GenericErrorMsgWithErrorCode extends StringResourcesBase {
        public final int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GenericErrorMsgWithErrorCode(int i) {
            super(CollectionsKt.R(Integer.valueOf(i)));
            StringEnum stringEnum = StringEnum._AMOUNT;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GenericErrorMsgWithErrorCode) && this.b == ((GenericErrorMsgWithErrorCode) obj).b;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getB() {
            return this.b;
        }

        public final String toString() {
            return b3.d(this.b, "GenericErrorMsgWithErrorCode(errorCode=", ")");
        }
    }

    public StringResourcesBase(List list) {
        this.f10441a = list;
    }
}
