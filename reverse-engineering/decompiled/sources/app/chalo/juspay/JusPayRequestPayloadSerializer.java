package app.chalo.juspay;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lapp/chalo/juspay/JusPayRequestPayloadSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lapp/chalo/juspay/JusPayRequestPayload;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JusPayRequestPayloadSerializer extends JsonContentPolymorphicSerializer<JusPayRequestPayload> {
    public static final JusPayRequestPayloadSerializer c = new JusPayRequestPayloadSerializer(Reflection.a(JusPayRequestPayload.class));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3989a;

        static {
            int[] iArr = new int[JusPayAction.values().length];
            try {
                iArr[JusPayAction.Initiate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JusPayAction.GetUpiSessionToken.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JusPayAction.OnBoardingAndPay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JusPayAction.UpdateAuth.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[JusPayAction.Management.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[JusPayAction.UpiUiScanPay.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[JusPayAction.Unknown.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3989a = iArr;
        }
    }

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public final DeserializationStrategy a(JsonElement element) {
        Intrinsics.i(element, "element");
        if (JsonElementKt.g(element).containsKey("action") && (JsonElementKt.g(element).get("action") instanceof JsonPrimitive)) {
            Object obj = JsonElementKt.g(element).get("action");
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.serialization.json.JsonPrimitive");
            if (((JsonPrimitive) obj).getF18195a()) {
                JusPayAction.Companion companion = JusPayAction.INSTANCE;
                Object obj2 = JsonElementKt.g(element).get("action");
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlinx.serialization.json.JsonPrimitive");
                String c2 = ((JsonPrimitive) obj2).getC();
                companion.getClass();
                switch (WhenMappings.f3989a[JusPayAction.Companion.a(c2).ordinal()]) {
                    case 1:
                        return JusPayRequestPayload.InitiateSDK.INSTANCE.serializer();
                    case 2:
                        return JusPayRequestPayload.GetUpiSessionToken.INSTANCE.serializer();
                    case 3:
                        return JusPayRequestPayload.OnBoardingAndPay.INSTANCE.serializer();
                    case 4:
                        return JusPayRequestPayload.UpdateSessionToken.INSTANCE.serializer();
                    case 5:
                        return JusPayRequestPayload.Management.INSTANCE.serializer();
                    case 6:
                        return JusPayRequestPayload.UpiUiScanPay.INSTANCE.serializer();
                    case 7:
                        throw new SerializationException("Unknown subclass");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
        throw new SerializationException("Unknown subclass");
    }
}
