package app.chalo.validationsdk.blevalidation.data.models;

import defpackage.cb0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ValidationPayloadMetaData;", "", "QuickPayMeta", "Lapp/chalo/validationsdk/blevalidation/data/models/ValidationPayloadMetaData$QuickPayMeta;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ValidationPayloadMetaData {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/ValidationPayloadMetaData$QuickPayMeta;", "Lapp/chalo/validationsdk/blevalidation/data/models/ValidationPayloadMetaData;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickPayMeta implements ValidationPayloadMetaData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10481a;

        public QuickPayMeta(boolean z) {
            this.f10481a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof QuickPayMeta) && this.f10481a == ((QuickPayMeta) obj).f10481a;
        }

        public final int hashCode() {
            return this.f10481a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("QuickPayMeta(isClosedLoop=", ")", this.f10481a);
        }
    }
}
