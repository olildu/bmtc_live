package app.chalo.validationsdk.blevalidation.data.models;

import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LatLng;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.ticketvalidation.TicketQrSchemaType;
import app.chalo.ticketvalidation.TicketValidationMetaInfo;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"validationsdk_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TicketValidationMetaInfoExtensionsKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10480a;

        static {
            int[] iArr = new int[TicketQrSchemaType.values().length];
            try {
                iArr[TicketQrSchemaType.REGULAR_STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TicketQrSchemaType.DYNAMIC_BMRCL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10480a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007e A[PHI: r8 r10
      0x007e: PHI (r8v3 app.chalo.ticketvalidation.TicketValidationMetaInfo) = 
      (r8v1 app.chalo.ticketvalidation.TicketValidationMetaInfo)
      (r8v9 app.chalo.ticketvalidation.TicketValidationMetaInfo)
      (r8v9 app.chalo.ticketvalidation.TicketValidationMetaInfo)
      (r8v9 app.chalo.ticketvalidation.TicketValidationMetaInfo)
     binds: [B:58:0x007e, B:32:0x006b, B:38:0x007c, B:35:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r10v2 app.chalo.providers.cityprovider.CityProvider) = 
      (r10v1 app.chalo.providers.cityprovider.CityProvider)
      (r10v4 app.chalo.providers.cityprovider.CityProvider)
      (r10v4 app.chalo.providers.cityprovider.CityProvider)
      (r10v4 app.chalo.providers.cityprovider.CityProvider)
     binds: [B:58:0x007e, B:32:0x006b, B:38:0x007c, B:35:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(TicketValidationMetaInfo ticketValidationMetaInfo, ChaloLocationManager chaloLocationManager, CityProvider cityProvider, ContinuationImpl continuationImpl) {
        TicketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1 ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1;
        LatLng latLng;
        if (continuationImpl instanceof TicketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1) {
            ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1 = (TicketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1) continuationImpl;
            int i = ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1.label = i - Integer.MIN_VALUE;
            } else {
                ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1 = new TicketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1(continuationImpl);
            }
        } else {
            ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1 = new TicketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1(continuationImpl);
        }
        Object objA = ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objA);
                TicketQrSchemaType ticketQrSchemaType = ticketValidationMetaInfo != null ? ticketValidationMetaInfo.f9627a : null;
                int i3 = ticketQrSchemaType == null ? -1 : WhenMappings.f10480a[ticketQrSchemaType.ordinal()];
                if (i3 == -1 || i3 == 1) {
                    return null;
                }
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1.L$0 = ticketValidationMetaInfo;
                ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1.L$1 = cityProvider;
                ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1.label = 1;
                objA = chaloLocationManager.a(ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1);
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cityProvider = (CityProvider) ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1.L$1;
                ticketValidationMetaInfo = (TicketValidationMetaInfo) ticketValidationMetaInfoExtensionsKt$toDynamicQrScheme$1.L$0;
                ResultKt.b(objA);
            }
            LocationAppModel locationAppModelA = ((LocationUpdateResult) objA).a();
            if (locationAppModelA != null) {
                latLng = locationAppModelA.a();
                if (latLng.f5134a == 0.0d || latLng.b == 0.0d) {
                    latLng = null;
                }
            } else {
                latLng = null;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
        }
        if (latLng == null) {
            CityAppModel cityAppModel = (CityAppModel) cityProvider.b().getValue();
            LatLng latLng2 = cityAppModel != null ? cityAppModel.d : null;
            latLng = latLng2 == null ? new LatLng(0.0d, 0.0d) : latLng2;
        }
        String str = ticketValidationMetaInfo.b;
        if (str == null) {
            str = "";
        }
        return new DynamicQrScheme.BmrclMetro(str, latLng.f5134a, latLng.b);
    }
}
